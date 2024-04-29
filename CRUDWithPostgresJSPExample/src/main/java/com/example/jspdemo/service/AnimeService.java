package com.example.jspdemo.service;


import com.example.jspdemo.model.Anime;
import com.example.jspdemo.repo.IAnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

@Service
public class AnimeService {

    @Autowired
    IAnimeRepository animeRepo;

    public List<Anime> getAllAnime() {
        List<Anime> animeList = new ArrayList<>();
        animeRepo.findAll().forEach(anime -> animeList.add(anime));
        System.out.println(animeList);
        return animeList;
    }

    public Anime getAnimeById(Long customerid) {
        return animeRepo.findById(customerid).get();
    }

    public boolean saveOrUpdateAnime(Anime anime) {
        Anime updatedAnime = animeRepo.save(anime);

        if (animeRepo.findById(updatedAnime.getCustomerid()) != null) {
            return true;
        }

        return false;
    }

    public boolean deleteAnime(Long customerid) {
        animeRepo.deleteById(customerid);

        if (animeRepo.findById(customerid) != null) {
            return true;
        }

        return false;
    }

}

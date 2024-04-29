package com.example.jspdemo.model;

import javax.persistence.*;

@Entity
@Table(name="jspwithpostgresql")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerid;

    @Column
    private String customername;

    @Column
    private int customerage;

    public Anime() {

    }

	public long getCustomerid() {
		System.out.println("Getter------------------------------------------------------------------>"+customerid);
		return customerid;
	}

	public void setCustomerid(long customerid) {
		System.out.println("Setter------------------------------------------------------------------>"+customerid);
		this.customerid = customerid;
	}

	

	

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerage() {
		return customerage;
	}

	public void setCustomerage(int customerage) {
		this.customerage = customerage;
	}

}

package com.example.spring.cricket.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cricket")
public class Cricket {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    private String name;
    private int runs;
    private float StrikeRate;
       public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public float getStrikeRate() {
		return StrikeRate;
	}
	public void setStrikeRate(float strikeRate) {
		StrikeRate = strikeRate;
	}
	@Override
	public String toString() {
		return "Cricket [id=" + id + ", name=" + name + ", runs=" + runs + ", StrikeRate=" + StrikeRate + "]";
	}
	
	
}

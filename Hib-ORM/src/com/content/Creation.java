package com.content;

import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="automobiles")

public class Creation {
	/*
	 * Scanner scan = new Scanner(System.in);
	 */
	
	
	/**
	 * 
	 */
	
	/**
	 * @param id
	 * @param model
	 * @param price
	 * @param brand
	 */
	

	@Id
	@Column(name="car_id")
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	
	@Column(name="car_model")
	private String model;
	
	@Column(name="cost")
	private int price;
    
	@Column(name="car_brand")
	private String brand;
	
	
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
public Creation() {
		
	}
	public Creation(int id, String model, int price, String brand) {
		
		this.id = id;
		this.model = model;
		this.price = price;
		this.brand = brand;
	}
	
	
	@Override
	public String toString() {
		return "Creation [id=" + id + ", model=" + model + ", price=" + price + ", brand=" + brand + "]";
	}

}

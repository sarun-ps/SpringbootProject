package com.SpringBoot.SweetDB.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sweetshop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int serialNo;
	private String sweetName;
	private int quantity;
	private double price;
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getSweetName() {
		return sweetName;
	}
	public void setSweetName(String sweetName) {
		this.sweetName = sweetName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Sweetshop(String sweetName, int quantity, double price) {
		super();
		this.sweetName = sweetName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Sweetshop() {}
	
	
}

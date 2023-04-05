package com.SpringBoot.SweetDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringBoot.SweetDB.Model.Sweetshop;
import com.SpringBoot.SweetDB.Repository.SweetshopRepository;

@SpringBootApplication
public class SweetShopDataBaseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SweetShopDataBaseApplication.class, args);
	}
	@Autowired
	private SweetshopRepository sweetshoprepository;
	
	@Override
	public void run(String... args) throws Exception{
		this.sweetshoprepository.save(new Sweetshop ("Ladoo", 20, 50));
		this.sweetshoprepository.save(new Sweetshop ("Jilebi", 15, 20));
	}
}

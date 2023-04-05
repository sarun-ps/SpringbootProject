package com.SpringBoot.SweetDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.SweetDB.Model.Sweetshop;
import com.SpringBoot.SweetDB.Repository.SweetshopRepository;

@RestController
@RequestMapping("/api")
public class SweetshopController {
	@Autowired
	private SweetshopRepository sweetshoprepository;
	
	@GetMapping("/details")
	public List<Sweetshop> getDetails(){
		return sweetshoprepository.findAll();
	}

}

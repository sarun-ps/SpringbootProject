package com.SpringBoot.SweetDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.SweetDB.Model.Sweetshop;

@Repository
public interface SweetshopRepository extends JpaRepository<Sweetshop, Long>{

}

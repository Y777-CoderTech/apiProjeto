package com.agencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agencia.models.Travel;



public interface TravelRepository extends JpaRepository <Travel, Long> { 

}

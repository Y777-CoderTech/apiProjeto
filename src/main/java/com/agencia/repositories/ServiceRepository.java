package com.agencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agencia.models.Service;

public interface ServiceRepository extends JpaRepository <Service, Long> {

}

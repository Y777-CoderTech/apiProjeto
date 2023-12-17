package com.agencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agencia.models.Client;



public interface ClientRepository extends JpaRepository <Client, Long> {

}

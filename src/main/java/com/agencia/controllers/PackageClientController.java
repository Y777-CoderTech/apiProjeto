package com.agencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agencia.dto.PackageDTO;
import com.agencia.services.PackageService;

@RestController
@RequestMapping("/packagerelclient")
public class PackageClientController {

	@Autowired
	private PackageService cs;
	
	
	
	@PostMapping("/addpackageeclient")
	public ResponseEntity<String> addRelationship(@RequestBody PackageDTO csDTO){
		cs.addRelationship(csDTO.getPackageId(), csDTO.getClientId());
		
		
		return new ResponseEntity<>("Relatioship created", HttpStatus.CREATED);
		
		
	}
	
	
	
	@GetMapping("/findallrels")
	public List<Object> getAllRels(){
		
		
		return cs.findAllRels();
	}
	
	
	
	
	
	
}

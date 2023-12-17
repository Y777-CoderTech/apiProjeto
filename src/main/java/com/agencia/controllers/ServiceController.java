package com.agencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agencia.dto.ServiceDTO;
import com.agencia.services.ServiceService;
import com.agencia.models.Service;

public class ServiceController {
	@RestController
	@RequestMapping("/service")
	public class ServiceServiceController {

		@Autowired
		private ServiceService sp;

		@PostMapping("/saveservice")
		public Service createService(@RequestBody ServiceDTO serviceDTO) {

			return sp.saveService(serviceDTO);
		}

		@GetMapping("/allservices")
		public List<Service> getAllServices() {

			return sp.getAllServices();
		}
		
		
		@GetMapping("/{id}")
		public ResponseEntity<Service> getServiceById(@PathVariable Long id){
			Service services = sp.getServiceById(id);
			
			return ResponseEntity.ok(services);
		}
		
		
		@PutMapping("/{id}")
		public ResponseEntity<Service> updateService(@PathVariable Long id, @RequestBody ServiceDTO serviceDTOUpdated){
			Service services = sp.getServiceById(id);
			
			
			
			services.setId(serviceDTOUpdated.getserviceId());
			
			services.setClientId(serviceDTOUpdated.getClientId());
	        sp.save(services);
			sp.updateService(id, serviceDTOUpdated);
			
			return ResponseEntity.ok(services);
		}
		
		
		@DeleteMapping("/{id}")
		public void deleteService(@PathVariable Long id) {
			sp.deleteById(id);
		}
		
		
	
}

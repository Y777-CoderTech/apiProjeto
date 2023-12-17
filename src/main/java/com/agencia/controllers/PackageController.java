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

import com.agencia.dto.PackageDTO;
import com.agencia.services.PackageService;
import com.agencia.models.Package;

public class PackageController {

	
	@RestController
	@RequestMapping("/package")
	public class CourseController {

		@Autowired
		private PackageService cs;

		@PostMapping("/savepackage")
		public Package createPackage(@RequestBody PackageDTO packageDTO) {

			return cs.savePackage(packageDTO);
		}

		@GetMapping("/allpackages")
		public List<Package> getAllPackages() {

			return cs.getAllPackages();
		}
		
		
		@GetMapping("/{id}")
		public ResponseEntity<Package> getPackageById(@PathVariable Long id){
			Package packages = cs.getPackageById(id);
			
			return ResponseEntity.ok(packages);
		}
		
		
		@PutMapping("/{id}")
		public ResponseEntity<Package> updatePackage(@PathVariable Long id, @RequestBody PackageDTO packageDTOUpdated){
			Package packages = cs.getPackageById(id);
			
			
			
			packages.setName(packageDTOUpdated.getName());
			
			packages.setClientId(packageDTOUpdated.getClientId());
	        cs.save(packages);
			cs.updatePackage(id, packageDTOUpdated);
			
			return ResponseEntity.ok(packages);
		}
		
		
		@DeleteMapping("/{id}")
		public void deletePackage(@PathVariable Long id) {
			cs.deleteById(id);
		}
		
		
	
	
	
	}
	
}

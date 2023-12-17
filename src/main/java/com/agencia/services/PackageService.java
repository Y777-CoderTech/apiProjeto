package com.agencia.services;

import java.util.List;

import com.agencia.dto.PackageDTO;
import com.agencia.models.Package;




public interface PackageService {

	
	
	
	
	Package getPackageById(Long id);
	
	Package savePackage(PackageDTO packageDTO);
	
	Package updatePackage(Long id, PackageDTO packageDTOUpdated);
	
	void deleteById(Long id);
	
	void addRelationship(Long packageId, Long clientId);
	
	List<Object> findAllRels();

	List<Package> getAllPackages();

	void save(Package packages);

	

	

	
	
}

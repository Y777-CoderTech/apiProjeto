package com.agencia.services;

import java.util.List;

import com.agencia.dto.ServiceDTO;
import com.agencia.models.Service;

public interface ServiceService {

	
List<Service> getAllServices();
	
	Service getServiceById(Long id);
	
	Service saveService(ServiceDTO serviceDTO);
	
	Service updateService(Long id, ServiceDTO serviceDTOUpdated);
	
	void deleteById(Long id);
	
	void addRelationship(Long serviceId, Long clientId);
	
	List<Object> findAllRels();

	void save(Service services);
	
	
	
	
	
}

package com.agencia.services;

import java.util.List;

import com.agencia.dto.TravelDTO;
import com.agencia.models.Travel;

public interface TravelService {

	
	
List<Travel> getAllTravels();
	
	Travel getTravelById(Long id);
	
	Travel saveTravel(TravelDTO travelDTO);
	
	Travel updateTravel(Long id, TravelDTO packageDTOUpdated);
	
	void deleteById(Long id);
	
	void addRelationship(Long travelId, Long packageId, Long clientId);
	
	List<Object> findAllRels();
	
}

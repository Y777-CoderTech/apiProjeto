package com.agencia.servicesimpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencia.dto.PackageDTO;
import com.agencia.models.Reserva;
import com.agencia.repositories.ClientRepository;
import com.agencia.repositories.PackageRepository;
import com.agencia.services.PackageService;

@Service
public class PackageServiceImpl implements PackageService{

	
	
	
	
	
	@Override
	public Reserva getPackageById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reserva savePackage(PackageDTO packageDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reserva updatePackage(Long id, PackageDTO packageDTOUpdated) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRelationship(Long packageId, Long clientId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object> findAllRels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reserva> getAllPackages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Reserva packages) {
		// TODO Auto-generated method stub
		
	}

	
}

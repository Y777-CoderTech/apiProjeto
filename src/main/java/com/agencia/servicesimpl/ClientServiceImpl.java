package com.agencia.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencia.models.Client;
import com.agencia.repositories.ClientRepository;
import com.agencia.services.ClientService;


@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository cr;
	
	@Override
	public List<Client> getAllClients() {
		
		return cr.findAll();
	}

	@Override
	public Client getClientById(Long id) {
	
		return cr.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Not Found"));
	}

	@Override
	public Client saveClient(Client client) {
		
		return cr.save(client);
	}

	@Override
	public Client updateClient(Long id, Client clientUpdated) {
		Client clientExists = cr.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Not Found"));
		clientExists.setName(clientUpdated.getName());
		
		return cr.save(clientExists);
	}

	@Override
	public void deleteById(Long id) {
		cr.deleteById(id);
		
	}

}

package com.agencia.services;

import java.util.List;

import com.agencia.models.Client;




public interface ClientService {

List<Client> getAllClients();
	
	Client getClientById(Long id);
	
	Client saveClient(Client client);
	
	Client updateClient(Long id, Client clientUpdated);
	
	void deleteById(Long id);
	
	

	
}

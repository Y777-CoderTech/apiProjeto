package com.agencia.models;



import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Table(name = "Cliente")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "nomeCliente", length = 255, nullable = false)
	private String name;

	@Column(name= "cpfCliente", length = 11, nullable = false)
	private String cpf;
	
	@Column(name= "rgCliente", length = 9, nullable = false)
	private String rg;
	
	@Column(name= "telefoneCliente", length = 14, nullable = false)
	private String telefone;
	
	
	@Transient
	@OneToMany(mappedBy = "pacotes")
	@JsonIgnore
	private Set<Package> pacotes = new HashSet<>();
	
	@Transient
	
	@OneToMany(mappedBy = "services")
	@JsonIgnore
	private Set<Service> services = new HashSet<>();
	
    @Transient
	@OneToMany(mappedBy = "travels")
	@JsonIgnore
	private Set<Travel> travels = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Set<Package> getPacotes() {
		return pacotes;
	}

	public void setPacotes(Set<Package> pacotes) {
		this.pacotes = pacotes;
	}

	public Set<Service> getServices() {
		return services;
	}

	public void setServices(Set<Service> services) {
		this.services = services;
	}

	public Set<Travel> getTravels() {
		return travels;
	}

	public void setTravels(Set<Travel> travels) {
		this.travels = travels;
	}

	
	
}

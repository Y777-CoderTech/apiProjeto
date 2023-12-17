package com.agencia.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Travel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "nomeViagem", length = 255, nullable = false)
	private String name;

	@Column(name= "dataViagem", length = 10, nullable = false)
	private LocalDate datadia;
	
	@Column(name= "horaPartida", length = 8, nullable = false)
	private LocalDate horas;
	
	@Column(name= "origemViagem", length = 255, nullable = false)
	private String embarque;
	
	@Column(name= "destinoViagem", length = 255, nullable = false)
	private String desembarque;
	

	@ManyToOne
	@JoinColumn(name = "client_fk")
	private Client client;

	@ManyToOne
	@JoinColumn(name = "package_fk")
	private Package packages;

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

	public LocalDate getDatadia() {
		return datadia;
	}

	public void setDatadia(LocalDate datadia) {
		this.datadia = datadia;
	}

	public LocalDate getHoras() {
		return horas;
	}

	public void setHoras(LocalDate horas) {
		this.horas = horas;
	}

	public String getEmbarque() {
		return embarque;
	}

	public void setEmbarque(String embarque) {
		this.embarque = embarque;
	}

	public String getDesembarque() {
		return desembarque;
	}

	public void setDesembarque(String desembarque) {
		this.desembarque = desembarque;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Package getPackages() {
		return packages;
	}

	public void setPackages(Package packages) {
		this.packages = packages;
	}


}

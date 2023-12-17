package com.agencia.models;



import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


public class Package {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "nomePacote", length = 255, nullable = false)
	private String name;

	@Column(name= "idaevoltaPacote", length = 2, nullable = false)
	private String embarquedesembarque;
	
	@Column(name= "hospedagemPacote", length = 255, nullable = false)
	private String hotel;
	
	@Column(name= "cidadetourPacote", length = 255, nullable = false)
	private String cidade;
	
	@Column(name= "alimentacaoPacote", length = 255, nullable = false)
	private String food;
	

	@ManyToOne
	@JoinColumn(name = "client_fk")
	private Client client;


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


	public String getEmbarquedesembarque() {
		return embarquedesembarque;
	}


	public void setEmbarquedesembarque(String embarquedesembarque) {
		this.embarquedesembarque = embarquedesembarque;
	}


	public String getHotel() {
		return hotel;
	}


	public void setHotel(String hotel) {
		this.hotel = hotel;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getFood() {
		return food;
	}


	public void setFood(String food) {
		this.food = food;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public void setClientId(Long clientId) {

		
	}

	
}

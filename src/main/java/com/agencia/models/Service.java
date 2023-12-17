package com.agencia.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Service {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "tipoConta", length = 8, nullable = false)
	private String conta;

	@Column(name= "cartaoTipo", length = 8, nullable = false)
	private String cartao;
	
	@Column(name= "dataPagamento", length = 11, nullable = false)
	private LocalDate pagamento;
	
	@Column(name= "numeroParcelas", length = 2, nullable = false)
	private String parcelas;
	
	@Column(name= "valorCompra", length = 255, nullable = false)
	private Double valor;
	

	@ManyToOne
	@JoinColumn(name = "client_fk")
	private Client client;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getConta() {
		return conta;
	}


	public void setConta(String conta) {
		this.conta = conta;
	}


	public String getCartao() {
		return cartao;
	}


	public void setCartao(String cartao) {
		this.cartao = cartao;
	}


	public LocalDate getPagamento() {
		return pagamento;
	}


	public void setPagamento(LocalDate pagamento) {
		this.pagamento = pagamento;
	}


	public String getParcelas() {
		return parcelas;
	}


	public void setParcelas(String parcelas) {
		this.parcelas = parcelas;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public void setClientId(Long clientId) {
		// TODO Auto-generated method stub
		
	}

	
	
}

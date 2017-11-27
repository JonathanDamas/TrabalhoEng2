package br.edu.univas.si4.BD;

public class AluguelTO {
	
	private String nome;
	private int cpf;
	private String data;
	private String modelo;
	private String placa;
	
	public AluguelTO(String nome, int cpf, String data, String modelo, String placa) {
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	

}

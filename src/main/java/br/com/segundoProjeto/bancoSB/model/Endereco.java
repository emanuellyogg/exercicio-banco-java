package br.com.segundoProjeto.bancoSB.model;

import javax.persistence.*;

@Entity
public class Endereco {

	@Id
	private String enderecoId;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private int cep;
	private String cidade;
	private String estado;

	public Endereco() {
	}

	public Endereco(String enderecoId, String rua, String numero, String complemento, String bairro, int cep, String cidade,
			String estado) {
		this.enderecoId = enderecoId;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	

	public String getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(String enderecoId) {
		this.enderecoId = enderecoId;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}

package br.com.segundoProjeto.bancoSB.dto;

import java.util.List;
import java.util.stream.Collectors;
import br.com.segundoProjeto.bancoSB.model.Endereco;

public class EnderecoDTO {

	private String enderecoId;
	private String bairro;
	private int cep;
	private String cidade;
	private String estado;

	public EnderecoDTO(Endereco endereco) {
		this.enderecoId = endereco.getEnderecoId();
		this.bairro = endereco.getBairro();
		this.cep = endereco.getCep();
		this.cidade = endereco.getCidade();
		this.estado = endereco.getEstado();
	}

	public String getEnderecoId() {
		return enderecoId;
	}

	public String getBairro() {
		return bairro;
	}

	public int getCep() {
		return cep;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public static List<EnderecoDTO> converter(List<Endereco> enderecos) {
		return enderecos.stream().map(EnderecoDTO::new).collect(Collectors.toList());
	}

}

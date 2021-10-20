package br.com.segundoProjeto.bancoSB.dto;

import java.util.List;
import java.util.stream.Collectors;
import br.com.segundoProjeto.bancoSB.model.Conta;

public class ContaDTO {

	private int numConta;
	private double saldo;
	private double limite;

	public ContaDTO(Conta conta) {
		this.numConta = conta.getNumConta();
		this.saldo = conta.getSaldo();
		this.limite = conta.getLimite();
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public static List<ContaDTO> converter(List<Conta> contas) {

		return contas.stream().map(ContaDTO::new).collect(Collectors.toList());
	}

}

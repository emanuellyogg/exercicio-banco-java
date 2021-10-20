package br.com.segundoProjeto.bancoSB.form;

import br.com.segundoProjeto.bancoSB.model.Conta;

public class AtualizacaoContaForm {
	
	private int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	//Método de atualização de senha
	public Conta atualizarSenha(int numConta, Conta contaRepository) {
		Conta conta = contaRepository;
		conta.setSenha(this.senha);
		return conta;
	}

}

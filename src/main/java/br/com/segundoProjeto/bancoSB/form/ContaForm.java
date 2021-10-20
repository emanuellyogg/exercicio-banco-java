package br.com.segundoProjeto.bancoSB.form;

import br.com.segundoProjeto.bancoSB.model.Conta;

public class ContaForm {

	private int numConta;
	private double saldo;
	private double limite;
	private int tipo;
	private int senha;

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	//Método que vai converter os dados do ContaForm para Conta
	public Conta converter() {
		return new Conta(numConta, saldo, limite, tipo, senha);
	}
}

package br.com.segundoProjeto.bancoSB.model;

import javax.persistence.*;

@Entity
public class Conta {

	@Id
	private int numConta;
	private double saldo;
	private double limite;
	private int tipo;
	private int senha;

	public Conta() {
	}

	public Conta(int numConta, double saldo, double limite, int tipo, int senha) {
		super();
		this.numConta = numConta;
		this.saldo = saldo;
		this.limite = limite;
		this.tipo = tipo;
		this.senha = senha;
	}

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

	// Métodos de Trabalhos
	public double depositar(double valorDeposito) {
		if (valorDeposito < 0) {
			return -101; // Erro
		}

		saldo = saldo + valorDeposito;
		return saldo;
	}

	public double sacar(double valorSaque) {

		if ((saldo + limite) < valorSaque) {
			return -102; // Erro

		} else if (valorSaque <= saldo) {
			saldo = saldo - valorSaque;
			return saldo;
		}
		double descLimite = valorSaque - saldo;
		limite = limite - descLimite;
		saldo = 0;

		return limite;
	}

}

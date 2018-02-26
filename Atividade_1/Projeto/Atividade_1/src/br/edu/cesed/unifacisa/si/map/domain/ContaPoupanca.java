package br.edu.cesed.unifacisa.si.map.domain;

import br.edu.cesed.unifacisa.si.map.abstractions.ContaBancaria;
import br.edu.cesed.unifacisa.si.map.component.GeradorDeHistorico;
import br.edu.cesed.unifacisa.si.map.exceptions.ValorInvalidoException;

/**
 * 
 * A classe ContaPoupanca criada no pacote br.edu.cesed.unifacisa.si.map.domain
 * para o projeto Atividade_1
 * 
 * @author Criada por Wesley Alves em 26 de fev de 2018
 * 
 */
public class ContaPoupanca extends ContaBancaria {

	public ContaPoupanca(int agencia, int conta, double valor, String cpf)
			throws ValorInvalidoException {

		super(agencia, conta, valor, cpf);

	}

	@Override
	public double deposito(double valor) throws ValorInvalidoException {

		if (valor <= 0) {
			throw new ValorInvalidoException();
		}

		double saldoAtual = this.getSaldo();

		saldoAtual += valor;

		this.setSaldo(saldoAtual);

		GeradorDeHistorico.adicionaTransação(" + ", this);

		return this.getSaldo();

	}

	@Override
	public double saque(double valor) throws ValorInvalidoException {

		double saldoAtual = this.getSaldo();

		if (valor <= 0 || valor > getSaldo()) {
			throw new ValorInvalidoException();
		}

		saldoAtual -= valor;

		this.setSaldo(saldoAtual);

		GeradorDeHistorico.adicionaTransação(" - ", this);

		return this.getSaldo();

	}

}

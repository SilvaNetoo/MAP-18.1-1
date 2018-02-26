package br.edu.cesed.unifacisa.si.map.domain;

import br.edu.cesed.unifacisa.si.map.abstractions.ContaBancaria;
import br.edu.cesed.unifacisa.si.map.component.GeradorDeHistorico;
import br.edu.cesed.unifacisa.si.map.component.Impostometro;
import br.edu.cesed.unifacisa.si.map.exceptions.ValorInvalidoException;

public class ContaCorrente extends ContaBancaria {

	private final static double VALOR_MINIMO = 10;

	public ContaCorrente(int agencia, int conta, double saldo, String cpf)
			throws ValorInvalidoException {

		super(agencia, conta, saldo, cpf);

	}

	public ContaCorrente(int agencia, int conta, String cpf) {

		super(agencia, conta, cpf);

	}

	/**
	 * 
	 * O método deposito() é responsável por realizar operação de adição de
	 * dinheiro, sobrescrevando da classe {@link ContaBancaria}, o método
	 * encontra-se na classe ContaBancaria, tem como retorno um void, foi criado por
	 * Wesley Alves em 26 de fev de 2018;
	 *
	 * @param valor
	 *            a ser depositado;
	 * 
	 * @return valor atual da conta;
	 * 
	 * @throws ValorInvalidoException
	 *             caso o valor seja menor ou igual ao valor minimo para deposito.
	 */
	@Override
	public double deposito(double valor) throws ValorInvalidoException {

		if (valor <= VALOR_MINIMO ) {
			throw new ValorInvalidoException();
		}

		double saldoAtual = this.getSaldo();

		saldoAtual += valor;

		this.setSaldo(saldoAtual);

		GeradorDeHistorico.adicionaTransação(" + ", this);

		return this.getSaldo();

	}

	/**
	 * 
	 * O método saque() é responsável por realizar operação de retirada de dinheiro,
	 * sobrescrevando da classe {@link ContaBancaria}, o método encontra-se na
	 * classe ContaBancaria, tem como retorno um void, foi criado por Wesley Alves
	 * em 26 de fev de 2018;
	 *
	 * @param valor
	 *            a ser depositado;
	 * 
	 * @return valor retirado da conta;
	 * 
	 * @throws ValorInvalidoException
	 *             caso o valor seja menor ou igual a 0 ou um valor impar ou maior
	 *             que o limite disponivel.
	 */
	@Override
	public double saque(double valor) throws ValorInvalidoException {

		double saldoAtual = this.getSaldo();
		double valorComImposto = Impostometro.calcularImposto(valor) + valor;

		if (valor <= 0 || valor % 2 != 0 || valorComImposto > saldoAtual) {
			throw new ValorInvalidoException();
		}
		saldoAtual -= valorComImposto;

		this.setSaldo(saldoAtual);

		GeradorDeHistorico.adicionaTransação(" - ", this);

		return valor;

	}

}

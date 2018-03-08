package br.edu.cesed.unifacisa.si.map.abstractions;

import br.edu.cesed.unifacisa.si.map.exceptions.ValorInvalidoException;

/**
 * 
 * A classe Operacionavel criada no pacote
 * br.edu.cesed.unifacisa.si.map.abstractions para o projeto Atividade_2
 * 
 * @author Criada por Wesley Alves em 7 de mar de 2018
 */
public interface Operacionavel {
	/**
	 * 
	 * O método deposito() deve ser responsável por realizar operação de adição de
	 * dinheiro, o método encontra-se na classe ContaBancaria, tem como retorno um
	 * double, foi criado por Wesley Alves em 26 de fev de 2018;
	 *
	 * @param valor
	 *            a ser depositado;
	 * @return valor atual da conta;
	 * @throws ValorInvalidoException
	 *             caso o valor seja inválido para a operação.
	 */
	public double deposito(double valor) throws ValorInvalidoException;

	/**
	 * 
	 * O método saque() deve ser responsável por realizar operação de retirada
	 * de dinheiro, o método encontra-se na classe ContaBancaria, tem como retorno
	 * um double, foi criado por Wesley ALves em 26 de fev de 2018;
	 *
	 * @param valor
	 *            a ser retirado;
	 * @return valor retirado da conta;
	 * @throws ValorInvalidoException
	 *             caso o valor seja inválido para a operação.
	 */
	public double saque(double valor) throws ValorInvalidoException;

}

package br.edu.cesed.unifacisa.si.map.abstractions;

import java.time.LocalDate;
import java.util.ArrayList;

import br.edu.cesed.unifacisa.si.map.exceptions.ValorInvalidoException;

/**
 * 
 * A classe ContaBancaria criada no pacote
 * br.edu.cesed.unifacisa.si.map.abstractions para o projeto Atividade_1
 * 
 * @author Criada por Wesley Alves em 25 de fev de 2018 - Modificado em 07 de mar de 2018
 */
public abstract class ContaBancaria implements Operacionavel{

	private int agencia;
	private int conta;
	private double saldo;
	private String cpf;
	private LocalDate data;
	private ArrayList<String> historico;

	/**
	 * M�todo construtor da classe ContaBancaria.java recebe os seguintes
	 * par�metros:
	 *
	 * @param bandeira
	 *            referente ao cart�oo;
	 * @param agencia
	 *            em numeros sem separadores, referente ao local;
	 * @param conta
	 *            em numeros sem separadores, referente a numera��o da conta;
	 * @param valor
	 *            caso no ato da cria��o tenha j� um deposito;
	 * @param cpf
	 *            identificador da conta;
	 * @throws ValorInvalidoException
	 *             caso o valor fornecido para deposit�to no ato da cria��o seja
	 *             inv�lido.
	 */
	public ContaBancaria(int agencia, int conta, double valor, String cpf) throws ValorInvalidoException {

		this(agencia, conta, cpf);
		this.deposito(valor);

	}

	/**
	 * M�todo construtor da classe ContaBancaria.java recebe os seguintes
	 * par�metros:
	 *
	 * @param bandeira
	 *            referente ao cart�oo;
	 * @param agencia
	 *            em numeros sem separadores, referente ao local;
	 * @param conta
	 *            em numeros sem separadores, referente a numera��o da conta;
	 * @param cpf
	 *            identificador da conta;
	 */
	public ContaBancaria(int agencia, int conta, String cpf) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.cpf = cpf;
		this.data = LocalDate.now();
		this.historico = new ArrayList<String>();
	}

	/**
	 * M�todo getAgencia retorna algo do tipo int contendo o valor do atributo
	 * agencia.
	 * 
	 * @return Retorna o valor do atributo agencia representado no objeto.
	 */
	public int getAgencia() {

		return agencia;

	}

	/**
	 * M�todo setAgencia recebe um atributo agencia do tipo int e altera seu valor
	 * original no objeto.
	 * 
	 * @param Recebe
	 *            o par�metro agencia a ser modificado pelo atributo agencia na
	 *            classe.
	 */
	public void setAgencia(int agencia) {

		this.agencia = agencia;

	}

	/**
	 * M�todo getConta retorna algo do tipo int contendo o valor do atributo conta.
	 * 
	 * @return Retorna o valor do atributo conta representado no objeto.
	 */
	public int getConta() {

		return conta;

	}

	/**
	 * M�todo setConta recebe um atributo conta do tipo int e altera seu valor
	 * original no objeto.
	 * 
	 * @param Recebe
	 *            o par�metro conta a ser modificado pelo atributo conta na classe.
	 */
	public void setConta(int conta) {

		this.conta = conta;

	}

	/**
	 * M�todo getSaldo retorna algo do tipo double contendo o valor do atributo
	 * saldo.
	 * 
	 * @return Retorna o valor do atributo saldo representado no objeto.
	 */
	public double getSaldo() {

		return saldo;

	}

	/**
	 * M�todo setSaldo recebe um atributo saldo do tipo double e altera seu valor
	 * original no objeto.
	 * 
	 * @param Recebe
	 *            o par�metro saldo a ser modificado pelo atributo saldo na classe.
	 */
	public void setSaldo(double saldo) {

		this.saldo = saldo;

	}

	/**
	 * M�todo getHistorico retorna algo do tipo ArrayList<String> contendo o valor
	 * do atributo historico.
	 * 
	 * @return Retorna o valor do atributo historico representado no objeto.
	 */
	public ArrayList<String> getHistorico() {

		return historico;

	}

	/**
	 * M�todo setHistorico recebe um atributo historico do tipo ArrayList<String> e
	 * altera seu valor original no objeto.
	 * 
	 * @param Recebe
	 *            o parâmetro historico a ser modificado pelo atributo historico na
	 *            classe.
	 */
	public void setHistorico(ArrayList<String> historico) {

		this.historico = historico;

	}

	/**
	 * M�todo getCpf retorna algo do tipo String contendo o valor do atributo cpf.
	 * 
	 * @return Retorna o valor do atributo cpf representado no objeto.
	 */
	public String getCpf() {

		return cpf;

	}

	/**
	 * M�todo setCpf recebe um atributo cpf do tipo String e altera seu valor
	 * original no objeto.
	 * 
	 * @param Recebe
	 *            o par�metro cpf a ser modificado pelo atributo cpf na classe.
	 */
	public void setCpf(String cpf) {

		this.cpf = cpf;

	}

	/**
	 * M�todo getData retorna algo do tipo LocalDate contendo o valor do atributo
	 * data.
	 * 
	 * @return Retorna o valor do atributo data representado no objeto.
	 */
	public LocalDate getData() {

		return data;

	}

	/**
	 * M�todo setData recebe um atributo data do tipo LocalDate e altera seu valor
	 * original no objeto.
	 * 
	 * @param Recebe
	 *            o par�metro data a ser modificado pelo atributo data na classe.
	 */
	public void setData(LocalDate data) {

		this.data = data;

	}

	/**
	 * M�todo toString() da classe {@link ContaBancaria} � utilizado para emitir o
	 * extrato default da conta banc�ria;
	 * 
	 * @return extrato bancario.
	 */
	@Override
	public String toString() {
		return "Agencia: " + agencia + ", conta: " + conta + ", saldo presente: " + saldo;
	}

}

package br.edu.cesed.unifacisa.si.map.component;

import java.time.Instant;
import java.util.ArrayList;

import br.edu.cesed.unifacisa.si.map.abstractions.ContaBancaria;
import br.edu.cesed.unifacisa.si.map.domain.ContaCorrente;

/**
 * 
 * A classe GeradorDeHistorico criada no pacote
 * br.edu.cesed.unifacisa.si.map.component para o projeto Atividade_1
 * 
 * @author Criada por Wesley Alves em 26 de fev de 2018
 */
public class GeradorDeHistorico {

	/**
	 * 
	 * O método adicionaTransação() é responsável por realizar adição do histórico
	 * de transação da conta fornecida, o método encontra-se na classe
	 * GeradorDeHistorico, tem como retorno um void, foi criado por Wesley Alves em
	 * 26 de fev de 2018;
	 * 
	 * @param operacao
	 *            realizada + para adição e - para retirada;
	 * @param conta
	 *            na operação.
	 */
	public static void adicionaTransação(String operacao, ContaBancaria conta) {

		ArrayList<String> historico = conta.getHistorico();
		historico.add("\n ** Operação realizada: " + operacao + " " + conta.toString() + " em " + Instant.now());
		conta.setHistorico(historico);

	}

	/**
	 * 
	 * O método geraHistorico() é responsável por realizar Wesley Alves, o método
	 * encontra-se na classe GeradorDeHistorico, tem como retorno um String, foi
	 * criado por Wesley Alves em 26 de fev de 2018;
	 * 
	 * @param conta a ser retirado o histórico;
	 * @return histórico. 
	 */
	public static String geraHistorico(ContaBancaria conta) {

		String tipo = conta.getClass() == ContaCorrente.class ? "corrente" : "poupança";
		String retorno = "Abertura da conta " + tipo + " em: " + conta.getData() + "\n";

		for (String h : conta.getHistorico()) {
			retorno += h + "\n";
		}

		return retorno;

	}

}

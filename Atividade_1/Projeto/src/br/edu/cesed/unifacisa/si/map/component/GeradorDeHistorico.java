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
	 * O m�todo adicionaTransacao() � respons�vel por realizar adicionar ao
	 * hist�rico da conta a opera��o realizada, o m�todo encontra-se na classe
	 * GeradorDeHistorico, tem como retorno um void, foi criado por Wesley Alves em
	 * 7 de mar de 2018;
	 * 
	 * @param operacao realizada na conta;
	 * @param conta a ser alterada seu hist�rico.
	 */
	public static void adicionaTransacao(String operacao, ContaBancaria conta) {

		ArrayList<String> historico = conta.getHistorico();
		historico.add("\n ** Opera��o realizada: " + operacao + " " + conta.toString() + " em " + Instant.now());
		conta.setHistorico(historico);

	}

	/**
	 * 
	 * O m�todo geraHistorico() � respons�vel por construir o hist�rico de opera��es
	 * da conta, o m�todo encontra-se na classe GeradorDeHistorico, tem como retorno
	 * um String, foi criado por Wesley Alves em 7 de mar de 2018;
	 * 
	 * @param conta
	 *            a ser gerado o hist�rico;
	 * @return String contendo o hist�rico da conta.
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

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
	 * O método adicionaTransacao() é responsável por realizar adicionar ao
	 * histórico da conta a operação realizada, o método encontra-se na classe
	 * GeradorDeHistorico, tem como retorno um void, foi criado por Wesley Alves em
	 * 7 de mar de 2018;
	 * 
	 * @param operacao realizada na conta;
	 * @param conta a ser alterada seu histórico.
	 */
	public static void adicionaTransacao(String operacao, ContaBancaria conta) {

		ArrayList<String> historico = conta.getHistorico();
		historico.add("\n ** Operação realizada: " + operacao + " " + conta.toString() + " em " + Instant.now());
		conta.setHistorico(historico);

	}

	/**
	 * 
	 * O método geraHistorico() é responsável por construir o histórico de operações
	 * da conta, o método encontra-se na classe GeradorDeHistorico, tem como retorno
	 * um String, foi criado por Wesley Alves em 7 de mar de 2018;
	 * 
	 * @param conta
	 *            a ser gerado o histórico;
	 * @return String contendo o histórico da conta.
	 */
	public static String geraHistorico(ContaBancaria conta) {

		String tipo = conta.getClass() == ContaCorrente.class ? "corrente" : "poupanÃ§a";
		String retorno = "Abertura da conta " + tipo + " em: " + conta.getData() + "\n";

		for (String h : conta.getHistorico()) {
			retorno += h + "\n";
		}

		return retorno;

	}

}

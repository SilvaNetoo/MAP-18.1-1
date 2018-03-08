package br.edu.cesed.unifacisa.si.map.exceptions;

/**
 * 
 * A classe ValorInvalidoException criada no pacote
 * br.edu.cesed.unifacisa.si.map.exceptions para o projeto Atividade_1
 * 
 * @author Criada por Wesley Alves em 26 de fev de 2018
 */
public class ValorInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	private static final String MENSAGEM = "O valor fornecido é inválido para a operação";

	public ValorInvalidoException() {
		super(MENSAGEM);
	}
}

package br.edu.cesed.unifacisa.si.map.component;

/**
 * 
 * A classe Impostometro criada no pacote
 * br.edu.cesed.unifacisa.si.map.component para o projeto Atividade_1
 * 
 * @author Criada por Wesley ALves em 26 de fev de 2018
 */
public class Impostometro {

	private final static double IMPOSTO = 0.03;
	private final static double TAXA_DE_MANUTENCAO = 3.50;

	/**
	 * 
	 * O método calcularImposto() é responsável por realizar calculo do imposto
	 * recebido como parâmetro, o método encontra-se na classe Impostometro, tem
	 * como retorno um double, foi criado por Wesley ALves em 7 de mar de 2018;
	 * 
	 * @param valor a ser taxado;
	 * @return valor atualizado com as taxas.
	 */
	public static double calcularImposto(double valor) {
		return ((valor * IMPOSTO) + TAXA_DE_MANUTENCAO);
	}

}

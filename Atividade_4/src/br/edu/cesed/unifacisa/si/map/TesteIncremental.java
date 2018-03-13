package br.edu.cesed.unifacisa.si.map;

/**
 * 
 * A classe TesteIncremental criada no pacote br.edu.cesed.unifacisa.si.map para
 * o projeto Atividade_4, referente ao tema sobre Singleton;
 * 
 * @author Criada por Wesley Alves em 13 de mar de 2018.
 */
public class TesteIncremental {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {

			System.out.println(Incremental.getIncremental());

		}

	}

}

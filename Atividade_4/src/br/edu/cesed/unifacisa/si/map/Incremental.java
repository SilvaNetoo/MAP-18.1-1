package br.edu.cesed.unifacisa.si.map;

/**
 * 
 * A classe Incremental criada no pacote br.edu.cesed.unifacisa.si.map para o
 * projeto Atividade_4, referente ao tema sobre Singleton;
 * 
 * @author Criada por Wesley Alves em 13 de mar de 2018.
 */
public class Incremental {

	private static int count = 0;
	private static int numero;

	private static Incremental inc = new Incremental();

	private Incremental() {

	}

	public String toString() {
		return "Incremental " + numero;
	}

	/**
	 * 
	 * O método getIncremental() é responsável por realizar o incremento da variavel
	 * numero e retornar a instancia do objeto, que foi criada apenas uma vez, o
	 * método encontra-se na classe Incremental, tem como retorno um Incremental,
	 * foi criado por Wesley Alves em 13 de mar de 2018;
	 * 
	 * @return Incremental objeto instanciado pela classe {@link Incremental}.
	 */
	public static Incremental getIncremental() {
		numero = ++count;
		return inc;
	}
}

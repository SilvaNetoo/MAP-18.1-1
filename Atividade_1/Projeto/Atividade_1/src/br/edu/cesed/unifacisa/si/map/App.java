package br.edu.cesed.unifacisa.si.map;

import br.edu.cesed.unifacisa.si.map.abstractions.ContaBancaria;
import br.edu.cesed.unifacisa.si.map.component.GeradorDeHistorico;
import br.edu.cesed.unifacisa.si.map.domain.ContaCorrente;
import br.edu.cesed.unifacisa.si.map.exceptions.ValorInvalidoException;

/**
 * 
 * A classe App criada no pacote br.edu.cesed.unifacisa.si.map para o projeto Atividade_1;
 * 
 * Fluxo de execução da atividade de MAP 2018.1 das questões 4, 6 e 8;
 * 
 * @author Criada por Wesley Alves em 26 de fev de 2018.
 */
public class App {

	public static void main(String[] args) throws ValorInvalidoException {
		
		ContaBancaria contaNova = new ContaCorrente(201015,11562345,"12232145678");
		
		contaNova.deposito(100);
		
		System.out.println(GeradorDeHistorico.geraHistorico(contaNova));
		
		contaNova.saque(50);
		
		System.out.println(GeradorDeHistorico.geraHistorico(contaNova));

	}

}

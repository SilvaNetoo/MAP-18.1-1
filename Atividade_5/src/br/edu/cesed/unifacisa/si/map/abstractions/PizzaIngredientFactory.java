/**
 * 
 */
package br.edu.cesed.unifacisa.si.map.abstractions;

import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Cheese;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Clams;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Dough;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Pepperoni;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Sauce;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Veggies;

/**
 * A interface PizzaIngredientFactory criada no pacote
 * br.edu.cesed.unifacisa.si.map.abstractions para o projeto Atividade_5,
 * referente ao tema Abstract Facotry
 * 
 * @author Criada por Wesley Alves em 13 de mar de 2018
 */
public interface PizzaIngredientFactory {
	
	Dough createDough();

	Cheese createCheese();

	Clams createClams();

	Pepperoni createPepperoni();

	Sauce createSauce();

	Veggies createVeggies();

	String getInfo();
}

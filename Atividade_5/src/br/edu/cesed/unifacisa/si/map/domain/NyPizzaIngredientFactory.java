package br.edu.cesed.unifacisa.si.map.domain;

import br.edu.cesed.unifacisa.si.map.abstractions.PizzaIngredientFactory;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Cheese;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Clams;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Dough;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Pepperoni;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Sauce;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Veggies;
import br.edu.cesed.unifacisa.si.map.domain.ingredients.FreshClams;
import br.edu.cesed.unifacisa.si.map.domain.ingredients.PlumTomatoSauce;
import br.edu.cesed.unifacisa.si.map.domain.ingredients.ReggianoCheese;
import br.edu.cesed.unifacisa.si.map.domain.ingredients.ThickCrustDought;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory {


	@Override
	public String getInfo() {

		return "New York Pizzas";
		
	}

	@Override
	public Dough createDough() {

		return new ThickCrustDought();

	}

	@Override
	public Cheese createCheese() {

		return new ReggianoCheese();

	}

	@Override
	public Clams createClams() {

		return new FreshClams();

	}

	@Override
	public Pepperoni createPepperoni() {

		return null;

	}

	@Override
	public Sauce createSauce() {

		return new PlumTomatoSauce();

	}

	@Override
	public Veggies createVeggies() {

		return null;

	}
}

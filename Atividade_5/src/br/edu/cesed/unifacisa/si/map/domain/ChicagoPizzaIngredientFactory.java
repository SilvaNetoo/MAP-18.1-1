package br.edu.cesed.unifacisa.si.map.domain;

import br.edu.cesed.unifacisa.si.map.abstractions.PizzaIngredientFactory;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Cheese;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Clams;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Dough;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Pepperoni;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Sauce;
import br.edu.cesed.unifacisa.si.map.abstractions.ingredients.Veggies;
import br.edu.cesed.unifacisa.si.map.domain.ingredients.FrozenClams;
import br.edu.cesed.unifacisa.si.map.domain.ingredients.MarinaraSauce;
import br.edu.cesed.unifacisa.si.map.domain.ingredients.MozzarellaCheese;
import br.edu.cesed.unifacisa.si.map.domain.ingredients.ThinCrustDought;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public String getInfo() {

		return "Chicago Pizzas";
		
	}

	@Override
	public Dough createDough() {

		return new ThinCrustDought();

	}

	@Override
	public Cheese createCheese() {

		return new MozzarellaCheese();

	}

	@Override
	public Clams createClams() {

		return new FrozenClams();

	}

	@Override
	public Pepperoni createPepperoni() {

		return null;

	}

	@Override
	public Sauce createSauce() {

		return new MarinaraSauce();

	}

	@Override
	public Veggies createVeggies() {

		return null;

	}

}

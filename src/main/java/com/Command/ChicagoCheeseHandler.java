package com.Command;

import com.Builder.PizzaTreeBuilder;
import com.Factory.ChicagoPizzaStore;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;
import com.Pizza.PizzaComposite;

public class ChicagoCheeseHandler extends PizzaHandler {

    public ChicagoCheeseHandler(com.Factory.PizzaStore pizzaStore){
        super(pizzaStore);
    }

    public PizzaComponent getPizza(){

        PizzaTreeBuilder cheesePizza = new PizzaTreeBuilder("Tasty Cheesy");
        cheesePizza.addIngredient("cheese");
        cheesePizza.addIngredient("mozzarella");

        return cheesePizza.getPizza();
    }

}

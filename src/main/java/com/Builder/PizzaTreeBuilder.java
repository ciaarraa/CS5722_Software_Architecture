package com.Builder;


import com.Pizza.PizzaComposite;
import com.Pizza.PizzaComponent;

public class PizzaTreeBuilder {
    private PizzaComposite pizzaComposite;
    private IngredientsRegistry ingredientsRegistry;


    public PizzaTreeBuilder(String name){
        this.pizzaComposite = new PizzaComposite(name);
        this.ingredientsRegistry = new IngredientsRegistry();
   }

   public void addIngredient(String name){
        pizzaComposite.add(ingredientsRegistry.getIngredient(name));
   }

   public void addPizza(String name){
        pizzaComposite.add(new PizzaComposite(name));
   }

   public PizzaComponent getPizza(){
        return pizzaComposite;
   }
}

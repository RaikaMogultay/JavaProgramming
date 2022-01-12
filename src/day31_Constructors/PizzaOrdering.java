package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        // create 100 pizza objects: size - 'S', cheese topping - 2, pepperoni topping -3
        // create 100 pizza objects: size - 'M', cheese topping - 3, pepperoni topping -4
        // create 100 pizza objects: size - 'L', cheese topping - 4, pepperoni topping -5

        for (int i =0; i <100; i++){

            Pizza small = new Pizza('S', 2,3);
            Pizza medium = new Pizza('M', 3,4);
            Pizza large = new Pizza('L', 3,5);

            pizzas.addAll(Arrays.asList(small,medium,large));

        }

        System.out.println("Total number of pizza: " + pizzas.size());
        double totalPrice = 0;

        for( Pizza pizza : pizzas){
            totalPrice += pizza.calcCost();
        }
        System.out.println("total price = " + totalPrice);

    }
}

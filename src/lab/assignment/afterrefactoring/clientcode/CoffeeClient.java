package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeMakerTemplate;
import lab.assignment.afterrefactoring.Americano;
import lab.assignment.afterrefactoring.Capuccino;
import lab.assignment.afterrefactoring.Mocha;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMakerTemplate starbuzz = new Mocha();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new Capuccino();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new Americano();
        starbuzz.prepareCoffee();

    }

}

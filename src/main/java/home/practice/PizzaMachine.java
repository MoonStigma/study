package home.practice;

public class PizzaMachine {
    public static void main(String[] args) {

        PizzaMakerFactory iWantPizza = new PizzaMakerFactory();
        AbstractPizzaMaker abstractPizza = iWantPizza.getPizzaMaker(Button.BUTTON_2);
        abstractPizza.bakePizza();
    }

}

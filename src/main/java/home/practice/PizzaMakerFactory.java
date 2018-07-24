package home.practice;

public class PizzaMakerFactory {
    public AbstractPizzaMaker getPizzaMaker(Button button){
        switch (button){
            case BUTTON_1:
                return new Carbonara();
            case BUTTON_2:
                return new Peperoni();
            case BUTTON_3:
                return new FourCheese();
            case BUTTON_4:
                return new Polo();
        }
        return null;
    }
}

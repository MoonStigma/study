package home.practice;

public class Peperoni extends AbstractPizzaMaker {
    protected void fill() {
        System.out.println("Добавляем колбасу");
    }

    protected void bake() {
        System.out.println("Выпекаем при 180 градусов");
        try {
            Thread.sleep(22000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected String getName() {
        return "Peperoni";
    }
}

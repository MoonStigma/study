package home.practice;

public class Carbonara extends AbstractPizzaMaker {


    protected void fill() {
        System.out.println("Добавляем ингридиенты");
    }

    protected void bake() {
        System.out.println("Выпекаем при 200 градусов");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected String getName() {
        return "Carbonara";
    }
}

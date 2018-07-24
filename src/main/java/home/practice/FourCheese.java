package home.practice;

public class FourCheese extends AbstractPizzaMaker {
    protected void fill() {
        System.out.println("Всунем сыры");
    }

    protected void bake() {
        System.out.println("Запекаем при 150 градусов");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    protected String getName() {
        return "4 сыра";
    }
}

package home.practice;

public abstract class AbstractPizzaMaker {
    public String bakePizza() {
        prepareTemplate();
        fill();
        bake();
        slice();
        box();
        return getName();
    }

    private void prepareTemplate() {
        System.out.println("Берём заготовку пиццы...");
    }

    protected abstract void fill();

    protected abstract void bake();

    protected void slice() {
        System.out.println("Режем на 8 кусков...");
    }

    protected abstract String getName();

    private void box() {
        System.out.println("Упаковываем...");
    }
}

package example;

public class Pepperoni implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Pizza dough, tomato sauce, mozzarella, pepperoni.");
    }
}
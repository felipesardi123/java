package example;

public class Neapolitan implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Pizza dough, tomato sauce, mozzarella, basil.");
    }
}
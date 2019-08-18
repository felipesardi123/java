/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package example;

public class App {
    public String getGreeting() {
        return "Welcome to the Java 8 Pizzeria.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        // Verbose
        Pizza pepperoni = new Pepperoni();
        Pizza neapolitan = new Neapolitan();
        Oven oven = new Oven();
        oven.bake(pepperoni);
        oven.bake(neapolitan);

        // Lambda
        Oven ovenLambda = new Oven();
        ovenLambda.bake( () -> System.out.println("Pizza Lambda") );
        ovenLambda.bake( () -> System.out.println("Pizza dough, tomato sauce, mozzarella, pepperoni.") );
        ovenLambda.bake( () -> System.out.println("Pizza dough, tomato sauce, mozzarella, basil.") );
    }
}
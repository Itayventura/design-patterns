package decorator;

public class Main {

    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        CoffeeWithCream coffeeWithCream = new CoffeeWithCream(simpleCoffee);
        CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk(coffeeWithCream);
        System.out.println("simple coffee:");
        System.out.println(simpleCoffee.getIngredients());
        System.out.println(simpleCoffee.getCost());
        System.out.println("\nwith cream:");
        System.out.println(coffeeWithCream.getIngredients());
        System.out.println(coffeeWithCream.getCost());
        System.out.println("\nwith milk:");
        System.out.println(coffeeWithMilk.getIngredients());
        System.out.println(coffeeWithMilk.getCost());
    }
}

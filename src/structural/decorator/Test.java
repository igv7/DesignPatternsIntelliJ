package structural.decorator;

public class Test {
    public static void main(String[] args) {

        System.out.println("*******Coffee*******");
        Coffee coffee = new Coffee();
        System.out.print(coffee.getCost() +" \t");
        System.out.println(coffee.getDescription());

        System.out.println("*******Cake*******");
        Cake cake = new Cake();
        System.out.print(cake.getCost() +"\t");
        System.out.println(cake.getDescription());

        System.out.println("*******Coffee+Cream*******");
        CreamDecorator coffeeCreamDecorator = new CreamDecorator(coffee);
        System.out.print(coffeeCreamDecorator.getCost() +"\t");
        System.out.println(coffeeCreamDecorator.getDescription());

        System.out.println("*******Cake+Cream*******");
        CreamDecorator cakeCreamDecorator = new CreamDecorator(cake);
        System.out.print(cakeCreamDecorator.getCost() +" \t");
        System.out.println(cakeCreamDecorator.getDescription());

        System.out.println("*******Coffee+Oreo*******");
        OreoDecorator coffeeOreoDecorator = new OreoDecorator(coffee);
        System.out.print(coffeeOreoDecorator.getCost() +" \t");
        System.out.println(coffeeOreoDecorator.getDescription());

        System.out.println("*******Cake+Oreo*******");
        OreoDecorator cakeOreoDecorator = new OreoDecorator(cake);
        System.out.print(cakeOreoDecorator.getCost() +" \t");
        System.out.println(cakeOreoDecorator.getDescription());

        System.out.println("*******Coffee+Cream+Oreo*******");
        OreoDecorator oreoDecoratorCoffee = new OreoDecorator(coffeeCreamDecorator);
        System.out.print(oreoDecoratorCoffee.getCost() +" \t");
        System.out.println(oreoDecoratorCoffee.getDescription());

        System.out.println("*******Cake+cream+Oreo*******");
        OreoDecorator oreoDecoratorCake = new OreoDecorator(cakeCreamDecorator);
        System.out.print(oreoDecoratorCake.getCost() +" \t");
        System.out.println(oreoDecoratorCake.getDescription());
    }
}

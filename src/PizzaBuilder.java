// Abstract Builder
abstract class PizzaBuilder {
    Pizza pizza;

    void buildPizza() {
        pizza = new Pizza();
    }

    abstract void takeName();
    abstract void takeCrust();
    abstract void takeSouse();
    abstract void takeTopping();

    Pizza getPizza(){
        return pizza;
    }
}


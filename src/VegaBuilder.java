// ConcreteBuilder
public class VegaBuilder extends PizzaBuilder{
    @Override
    void takeName() {
        pizza.setName("Lucky Cucumber");
    }

    @Override
    void takeCrust() {
        pizza.setCrust(Crust.thin);
    }

    @Override
    void takeSouse() {
        pizza.setSouse(Souse.ketchup);
    }

    @Override
    void takeTopping() {
        pizza.setTopping(Topping.vegetables);
    }
}

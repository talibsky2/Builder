// ConcreteBuilder
public class PepperoniBuilder extends PizzaBuilder{
    @Override
    void takeName() {
        pizza.setName("Pepperoni");
    }

    @Override
    void takeCrust() {
        pizza.setCrust(Crust.thick);
    }

    @Override
    void takeSouse() {
        pizza.setSouse(Souse.ketchup);
    }

    @Override
    void takeTopping() {
        pizza.setTopping(Topping.salami);
    }
}

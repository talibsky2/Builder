// ConcreteBuilder
public class ChickenBuilder extends PizzaBuilder {
    @Override
    void takeName() {
        pizza.setName("Chick Norris");
    }

    @Override
    void takeCrust() {
        pizza.setCrust(Crust.thin);
    }

    @Override
    void takeSouse() {
        pizza.setSouse(Souse.mayo);
    }

    @Override
    void takeTopping() {
        pizza.setTopping(Topping.chicken);
    }
}

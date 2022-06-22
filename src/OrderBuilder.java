// Director
public class OrderBuilder {
    PizzaBuilder order;
    void setOrder (PizzaBuilder p){
        order = p;
    }
    Pizza createOrder (){
        order.buildPizza();
        order.takeName();
        order.takeCrust();
        order.takeSouse();
        order.takeTopping();
        Pizza pizza = order.getPizza();
        return pizza;
    }
}

public class Order {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();
        orderBuilder.setOrder(new VegaBuilder());
        Pizza pizza = orderBuilder.createOrder();
        System.out.println(pizza);
    }
}
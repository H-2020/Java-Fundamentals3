package pizzaa;

public class Order {

    private Pizza[] pizzas;

    public Order(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }
}

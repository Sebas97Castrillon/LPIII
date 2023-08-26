package src.factory;

public class PizzaHawaiana implements Pizza{

    @Override
    public String getTipoMasa() {
        return "Delgada";
    }

    @Override
    public String getTipoQueso() {
        return "Mozzarella";
    }

    @Override
    public String getTipoToppings() {
        return "Jamón y Piña";
    }
}

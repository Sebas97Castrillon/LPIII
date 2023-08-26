package src.factory;

public class PizzaSalami implements Pizza{
    @Override
    public String getTipoMasa() {
        return "Grueso";
    }

    @Override
    public String getTipoQueso() {
        return "Quesito";
    }

    @Override
    public String getTipoToppings() {
        return "Salami";
    }
}

package src.factory;

public class CreadorPizzaHawaiana implements CreadorDePizza{
    @Override
    public Pizza crear() {
        return new PizzaHawaiana();
    }
}

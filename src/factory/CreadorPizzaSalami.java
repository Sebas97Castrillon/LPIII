package src.factory;

public class CreadorPizzaSalami implements CreadorDePizza{
    @Override
    public Pizza crear() {
        return new PizzaSalami();
    }
}

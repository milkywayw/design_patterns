package milkywayw.design_patterns.abstract_factory.factory;

public interface AbstractFactory
{
    public abstract MainOrder createMainOrder();
    public abstract SideDish createSideDish();
    public abstract Drink createDrink();
}
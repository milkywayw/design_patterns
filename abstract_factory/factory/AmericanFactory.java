package milkywayw.design_patterns.abstract_factory.factory;

public class AmericanFactory implements AbstractFactory
{
    public MainOrder createMainOrder()
    {
        return new Burger();
    }
    
    public SideDish createSideDish()
    {
        return new Fries();
    }
    
    public Drink createDrink()
    {
        return new Milkshake();
    }
}
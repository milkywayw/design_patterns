package milkywayw.design_patterns.abstract_factory.factory;

public class MexicanFactory implements AbstractFactory
{
    public MainOrder createMainOrder()
    {
        return new Burrito();
    }
    
    public SideDish createSideDish()
    {
        return new Taco();
    }
    
    public Drink createDrink()
    {
        return new Horchata();
    }
}
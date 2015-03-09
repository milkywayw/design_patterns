package milkywayw.design_patterns.abstract_factory.clients;

public class AmericanChain extends FastFoodChain
{
    public AmericanChain(String name)
    {
        super(name, new AmericanFactory());
    }
}
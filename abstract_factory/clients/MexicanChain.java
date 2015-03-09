package milkywayw.design_patterns.abstract_factory.clients;

public class MexicanChain extends FastFoodChain
{
    public MexicanChain(String name)
    {
        super(name, new MexicanFactory());
    }
}
package milkywayw.design_patterns.abstract_factory.clients;

public abstract class FastFoodChain
{
    private String restaurantName;
    private AbstractFactory factory;
    
    public FastFoodChain(String restaurantName, AbstractFactory af)
    {
        this.restaurantName = restaurantName;
        factory = af;
    }
    
    public void orderMeal()
    {
        MainOrder mainOrder = factory.createMainOrder();
        SideDish sideDish = factory.createSideDish();
        Drink drink = factory.createDrink();
          
        System.out.println("Welcome to " + restaurantName + "!");
        System.out.println("Here is your meal --");
        System.out.println("Main Order:\t" + mainOrder);
        System.out.println("Side Order:\t" + sideDish);
        System.out.println("Drink:\t\t" + drink);
    }
}
public class AbstractFactoryTest{
    public static void main(String[] args)
    {
        FastFoodChain burgerKing = new AmericanChain("Burger King");
        FastFoodChain tacoBell = new MexicanChain("Taco Bell");
        
        burgerKing.orderMeal();
        System.out.println();
        tacoBell.orderMeal();
    }
}

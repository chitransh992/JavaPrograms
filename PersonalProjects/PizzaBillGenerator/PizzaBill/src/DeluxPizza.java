public class DeluxPizza extends Pizza{
    public DeluxPizza(Boolean vegetarian){
        super(vegetarian);
        super.addExtraCheese();
        super.addExtraToppings();
        super.takeAway();
    }
    @Override
    public void addExtraCheese(){};
    @Override
    public void addExtraToppings(){};

}

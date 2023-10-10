public class Pizza {
    private int priceOfPizza;

    private Boolean vegetarian = true;

    private int addExtraCheese = 100;
    private int addExtraToppings = 150;
    private int backPack = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAwayOpted = false;

    public Pizza(boolean vegetarian)
    {
        this.vegetarian = vegetarian;
        if(this.vegetarian == true){
            this.priceOfPizza = 300;
        }
        else{
            this.priceOfPizza = 400;
        }
        basePizzaPrice = this.priceOfPizza;
    }
    public void addExtraCheese(){
         isExtraCheeseAdded = true;
         this.priceOfPizza+=addExtraCheese;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.priceOfPizza+=addExtraToppings;
    }
    public void takeAway(){
        isTakeAwayOpted = true;
        this.priceOfPizza += backPack;
    }
    public void getBill(){
        String bill = "";
        System.out.println("Pizza Price :"+basePizzaPrice);

        if(isExtraCheeseAdded){
            bill+="Extra Cheese Added: "+addExtraCheese+"\n";
        }
        if(isExtraToppingsAdded){
            bill+="Extra Toppings Added :"+addExtraToppings+"\n";
        }
        if(isTakeAwayOpted){
            bill+="Take Away Price Added :"+backPack+"\n";
        }
        bill += "Bill Amount :"+this.priceOfPizza+"\n";
        System.out.println(bill);
    }
}

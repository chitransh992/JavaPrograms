import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int choice,vegNonVegChoice;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please select the pizza you want : \n"+"1. Simple Pizza \n"+"2. DeluxPizza \n");
       choice =  scanner.nextInt();
       System.out.println("Do you want Veg pizza or Non veg Pizza \n"+"1. Veg Pizza \n"+"2. Non veg Pizza \n");
       vegNonVegChoice = scanner.nextInt();

       if(choice == 1) {
          if(vegNonVegChoice == 1) {
             Pizza basePizza = new Pizza(true);
             System.out.println("Do you want to Add Extra Cheese : \n"+"1. Yes \n"+"2. No");
             Scanner scanner1 = new Scanner(System.in);
             int choiceOnCheese = scanner1.nextInt();
             if(choiceOnCheese == 1){
                basePizza.addExtraCheese();
             }
             System.out.println("Do you want to add Toppings \n"+"1. Yes\n"+"2. No");
             int choiceOnToppings = scanner1.nextInt();
             if(choiceOnToppings == 1) {
                basePizza.addExtraToppings();
             }
             System.out.println("Select a choice if you want to get Take Away : \n"+"1. Yes\n"+"2. No");
             int choiceOnTakeAway = scanner1.nextInt();
             if(choiceOnTakeAway == 1) {
                basePizza.takeAway();
             }
             basePizza.getBill();
          }
          else {
             Pizza basePizza = new Pizza(false);
             System.out.println("Do you want to Add Extra Cheese : \n"+"1. Yes \n"+"2. No");
             Scanner scanner1 = new Scanner(System.in);
             int choiceOnCheese = scanner1.nextInt();
             if(choiceOnCheese == 1){
                basePizza.addExtraCheese();
             }
             System.out.println("Do you want to add Toppings \n"+"1. Yes\n"+"2. No");
             int choiceOnToppings = scanner1.nextInt();
             if(choiceOnToppings == 1) {
                basePizza.addExtraToppings();
             }
             System.out.println("Select a choice if you want to get Take Away : \n"+"1. Yes\n"+"2. No");
             int choiceOnTakeAway = scanner1.nextInt();
             if(choiceOnTakeAway == 1) {
                basePizza.takeAway();
             }
             basePizza.getBill();
          }
       }

       if(choice == 2){
          if(vegNonVegChoice == 1) {
             DeluxPizza deluxPizza = new DeluxPizza(true);
             System.out.println("Do you want to Add Extra Cheese : \n"+"1. Yes \n"+"2. No");
             Scanner scanner1 = new Scanner(System.in);
             int choiceOnCheese = scanner1.nextInt();
             if(choiceOnCheese == 1){
                deluxPizza.addExtraCheese();
             }
             System.out.println("Do you want to add Toppings \n"+"1. Yes\n"+"2. No");
             int choiceOnToppings = scanner1.nextInt();
             if(choiceOnToppings == 1) {
                deluxPizza.addExtraToppings();
             }
             System.out.println("Select a choice if you want to get Take Away : \n"+"1. Yes\n"+"2. No");
             int choiceOnTakeAway = scanner1.nextInt();
             if(choiceOnTakeAway == 1) {
                deluxPizza.takeAway();
             }
             deluxPizza.getBill();
          }
          else{

             DeluxPizza deluxPizza = new DeluxPizza(false);
             System.out.println("Do you want to Add Extra Cheese : \n"+"1. Yes \n"+"2. No");
             Scanner scanner1 = new Scanner(System.in);
             int choiceOnCheese = scanner1.nextInt();
             if(choiceOnCheese == 1){
                deluxPizza.addExtraCheese();
             }
             System.out.println("Do you want to add Toppings \n"+"1. Yes\n"+"2. No");
             int choiceOnToppings = scanner1.nextInt();
             if(choiceOnToppings == 1) {
                deluxPizza.addExtraToppings();
             }
             System.out.println("Select a choice if you want to get Take Away : \n"+"1. Yes\n"+"2. No");
             int choiceOnTakeAway = scanner1.nextInt();
             if(choiceOnTakeAway == 1) {
                deluxPizza.takeAway();
             }
             deluxPizza.getBill();
          }
       }
    }
}
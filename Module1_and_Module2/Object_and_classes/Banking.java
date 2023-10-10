//Banking system code

package Object_and_classes;

import java.util.Scanner;
class Account{
    int acc_no,amount;
    String name;
     Account(int a, String n, int amt){
        acc_no = a;
        name = n;
        amount = amt;
    }

    void display()
    {
        System.out.println(acc_no+" "+name+" "+amount+" ");
    }

    void checkBalance()
    {
        System.out.println("Balance is "+amount);
    }

    void deposit(int d){
        amount += d;
        System.out.println("deposited :"+d);
        System.out.println("Remaining balance is :"+amount);
    }
    void withdraw(int w)
    {
        if(w>amount){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println(w+" Amount Withdrawed");
            amount = amount-w;
            System.out.println(amount+" is the Remaining Balance");
        }
    }
}
public class Banking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the acc number :");
        int id = sc.nextInt();

        System.out.println("Please enter your name :");
        sc.nextLine();
        String str = sc.nextLine();

        System.out.println("Please enter the amount :");
        int amt = sc.nextInt();


        Account a1 = new Account(id,str,amt);

        a1.display();

        System.out.println("Please enter the amount to be Deposited :");
        int dep = sc.nextInt();

        a1.deposit(dep);

        System.out.println("Enter the amount to be withdraw :");
        int wd = sc.nextInt();
        a1.withdraw(wd);
    }
}

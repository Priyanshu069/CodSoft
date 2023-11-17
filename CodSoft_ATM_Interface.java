package me.company;
import java.util.*;
public class CodSoft_ATM_Interface {
     public static void main(String[] args)
     {
         int balance = 100000;
         Scanner sc=new Scanner(System.in);

              System.out.println("Enter your pin");
              int pin=sc.nextInt();
              if(pin==1234)
              {
                   System.out.println("........................................");
                   System.out.println("Please do not remove your card");
                   System.out.println("........................................");

                 while(true)
                 {
                      System.out.println("Enter 1 to check your balance");
                      System.out.println("Enter 2 to withdraw your money");
                      System.out.println("Enter 3 to deposit your balance");
                      System.out.println("Enter 4 to exit");

                      System.out.println("Enter your choice");
                      int choice=sc.nextInt();

                      switch(choice)
                      {
                           case 1:
                                System.out.println("Your available balance is "+balance);
                                break;

                           case 2:
                                System.out.println("Enter the amount of money you want to withdraw");
                                int withdraw=sc.nextInt();
                                if(balance>=withdraw)
                                {
                                     balance-=withdraw;
                                     System.out.println("Please collect your money");
                                }
                                else
                                {
                                     System.out.println("Insufficient balance");
                                }
                                break;

                           case 3:
                                System.out.println("Enter the amount of money you want to deposit");
                                int deposit=sc.nextInt();
                                balance+=deposit;
                                System.out.println("Your money has been successfully deposited");
                                break;

                           case 4:
                                System.exit(0);

                      }
                 }
              }
              else
              {
                   System.out.println("Invalid password!");
              }

     }
}

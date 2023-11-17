package me.company;
import java.util.*;
public class CodSoft_NumberGame {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int y=1;
        int score=0,round=0;
        while(y==1) {
            y=0;
            int c = 1, z = 5;
            while (c <= z) {
                System.out.println("Enter your number");
                int n = sc.nextInt();
                Random rand = new Random();
                int r = rand.nextInt(100);
                System.out.print("Random number printed by computer: " + r);

                System.out.println();
                if (n == r)
                {
                    score+=1;
                    System.out.println("your guess is correct");
                    break;
                }
                else if (n > r)
                {
                    System.out.println("your guess is too high");
                }
                else
                {
                    System.out.println("your guess is too low");
                }
                c++;
            }
            if (c == 6)
                System.out.println("you exceeded the number of limits");

            round+=1;
            System.out.println("Type 1 if you want to play the game again ");
            y=sc.nextInt();
        }
        System.out.println(score+" rounds won out of "+round+" rounds played");
    }
}

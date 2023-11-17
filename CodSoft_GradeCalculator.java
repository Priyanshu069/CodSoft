package me.company;
import java.util.*;
public class CodSoft_GradeCalculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type marks obtained out of 100 in each subjects");
        System.out.println("Type marks obtained in Math");
        int m=sc.nextInt();
        System.out.println("Type marks obtained in Physics");
        int p=sc.nextInt();
        System.out.println("Type marks obtained in Chemistry");
        int c=sc.nextInt();
        System.out.println("Type marks obtained in Economics");
        int ec=sc.nextInt();
        System.out.println("Type marks obtained in English");
        int en=sc.nextInt();

        int total_marks=m+p+c+ec+en;
        float avg_percentage=total_marks/(float)5;

        System.out.println("----------------------------------------");
        System.out.println("Total marks | Average Percentage | Grade");
        System.out.println("----------------------------------------");

        if(avg_percentage>=60)
            System.out.println(total_marks +"            "+ avg_percentage + "                  A");
        else if(avg_percentage>=45&&avg_percentage<60)
            System.out.println(total_marks +"            "+ avg_percentage + "                  B");
        else if(avg_percentage>=33&&avg_percentage<45)
            System.out.println(total_marks +"            "+ avg_percentage + "                  C");
        else
            System.out.println(total_marks +"            "+ avg_percentage + "                  Fail");
    }
}

package Home_work_may25;

import java.util.Scanner;

public class Highest_int_30_05 {

    int num1;
    int num2;
    int num3;

    void Highest_finder()
    {
       if (num1 > num2 && num1 > num3)
       {
           System.out.println(num1+" is the highest");
       }

        else if (num2 > num1 && num2 > num3)
        {
            System.out.println(num2+" is the highest");
        }

        else if (num3 > num1 && num3 > num2)
        {
            System.out.println(num3+" is the highest");
        }

        else
       {
           System.out.println("Enter the number correctly");
       }

    }

    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        Highest_int_30_05 hi = new Highest_int_30_05();

        System.out.println("Enter first number = ");
        hi.num1 = sc.nextInt();
        System.out.println("Enter second number = ");
        hi.num2 = sc.nextInt();
        System.out.println("Enter third number = ");
        hi.num3 = sc.nextInt();

        hi.Highest_finder();


    }

}

package Home_work_may25;

import java.util.Scanner;

public class Highest_int_30_05 {

    int num1;
    int num2;
    int num3;
    int res;

    void Highest_finder_and_optr()
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

    void Highest_finder_ternory_optr_one(){
        System.out.println("Using Second method ---------->>");
        System.out.println((num1>num2 && num1>num3) ? num1 +" is highest" : (num2>num1 && num2>num3) ? num2 +" is highest" : num3+" is highest");

    }

    void Highest_finder_ternory_optr_two(){

        //max = (num1 > num2) ? num1 : num2
        // greatest = (max > num3) ? max: num3 ;
        System.out.println("Using third method ---------->>");
        res= (((num1 > num2) ? num1 : num2) > num3) ? ( (num1 > num2) ? num1 : num2 ) : num3 ;
        System.out.println("The highest number is = "+ res);
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

        hi.Highest_finder_and_optr();
        hi.Highest_finder_ternory_optr_one();
        hi.Highest_finder_ternory_optr_two();



    }

}

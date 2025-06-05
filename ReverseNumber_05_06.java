package Home_work_may25;

import java.util.Scanner;

public class ReverseNumber_05_06 {
    int num,digit,rev=0;

    void revNum()
    {
        while(num>0)
        {
            digit = num%10;
            rev = rev*10+digit;

            num = num/10;

        }
        System.out.println("The reverse is = "+rev);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        ReverseNumber_05_06 rev = new ReverseNumber_05_06();

        rev.num = sc.nextInt();
        rev.revNum();
    }

}

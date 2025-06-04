package Home_work_may25;

import java.util.Scanner;

public class digitCount_evenOdd_HW_04_06 {

    int num,lim,sum=0;

    void digitCount()
    {

        while(num>0)
        {
            sum = sum + num % 10;
            num = num /10;
        }
        System.out.println("The digit sum is = " + sum);

    }

    void evenOdd()
    {
        for(int i = 1; i <= lim ; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("Even numbers = "+i+ " ");
            }
            else
            {
                System.out.print("Odd numbers = "+i+ " ");
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        digitCount_evenOdd_HW_04_06 dc = new digitCount_evenOdd_HW_04_06();
        System.out.print("Enter the number = ");
        dc.num = sc.nextInt();
        dc.digitCount();
        System.out.print("Enter the limit = ");
        dc.lim = sc.nextInt();
        dc.evenOdd();

    }

}

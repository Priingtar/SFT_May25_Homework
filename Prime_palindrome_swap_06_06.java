package Home_work_may25;

import java.util.Scanner;

public class Prime_palindrome_swap_06_06 {

    int enterNum,rev=0,digit,n,lim;

    int prim,prLim,count=0;

    int a,b,temp,c,d;

    void palin()
    {
        n = enterNum;
        while(n>0)
        {
            digit = n % 10;
            rev = rev * 10 + digit;

            n = n/10;
        }
        if(rev == enterNum){
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("the number is not palindrome");
        }

    }

    void prome()
    {
        if(prim > 1)
        {
            for (int i = 1; i<=prim; i++)
            {
                if(prim % i== 0)
                {
                    count ++;
                }
            }
            if(count == 2)
            {
                System.out.println("the number is prime");
            }
            else
            {
                System.out.println("number is not prime");
            }
        }
        else
        {
            System.out.println("no. is not prime");
        }
    }

    void swappTemp(){

        temp = a;
        a = b;
        b = temp;
        System.out.println("A value after swap = "+a);
        System.out.println("B value after swap = "+b);

    }
    void swapp()
    {
        c = c+d;
        d = c-d;
        c = c-d;
        System.out.println("A value after swap = "+c);
        System.out.println("B value after swap = "+d);
    }

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        Prime_palindrome_swap_06_06 pr = new Prime_palindrome_swap_06_06();
        System.out.print("Enter the value to check palindrome = ");
        pr.enterNum = sc.nextInt();
        pr.palin();

        System.out.print("Enter the number to check prime = ");
        pr.prim = sc.nextInt();
        pr.prome();

        System.out.print("Enter the value of first number (a) = ");
        pr.a = sc.nextInt();
        System.out.print("Enter the value of second number (b) = ");
        pr.b = sc.nextInt();
        pr.swappTemp();

        System.out.print("Enter the value of first number (a) = ");
        pr.c = sc.nextInt();
        System.out.print("Enter the value of second number (b) = ");
        pr.d = sc.nextInt();
        pr.swapp();



    }

}

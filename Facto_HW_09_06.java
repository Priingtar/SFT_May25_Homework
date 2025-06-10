package Home_work_may25;

import java.util.Scanner;

public class Facto_HW_09_06 {

    int fac=1,n;

    void factt()
    {
        for(int i = 1; i<=n; i++)
        {
            fac = fac *i;
        }
        System.out.println("The factorial of the given number is = "+fac);

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Facto_HW_09_06 ft = new Facto_HW_09_06();
        System.out.print("Enter the number you want factorial of = ");
        ft.n = sc.nextInt();
        ft.factt();


    }




}

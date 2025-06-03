package Home_work_may25;

import java.util.Scanner;

public class Digit_count_03_06 {

     int num;
     int rem = 0;
     int count = 0;
     int even_count = 0;
     int odd_count = 0;

     void number_len()
     {
        while(num>0)
        {
            num = num/10;
            count ++;
        }
        //System.out.println("The digits in number(number getting her is zero) are  = "+count);
         System.out.println(count);
     }

     void number_len_ven_odd()
     {
         while(num>0)
         {
             rem  = num%10;
             if(rem % 2 == 0)
             {
                 even_count ++;
             }
             else
             {
                 odd_count ++;
             }
             
             num = num /10;
             count++;

         }
         System.out.println("Digits counts = "+count);
         System.out.println("Even digits counts = "+even_count);
         System.out.println("Odd digits counts = "+odd_count);

     }

     public static void main(String args[] ){

         Scanner sc = new Scanner(System.in);

         Digit_count_03_06 di = new Digit_count_03_06();
         System.out.print("Enter the number = ");
         di.num = sc.nextInt();
         //System.out.print("The number of digits in "+di.num+" are = ");
         //di.number_len();

         di.number_len_ven_odd();







    }

}

package Home_work_may25;

import java.util.Scanner;


public class atm_homework_26 {

    public static void main(String args[]) {

//		Check Balance
//		Deposit Money
//		Withdraw Money
//		Exit

        double enterMoney;
        double resMoney=0;
        int choice;

        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("----------------------");
            System.out.println("***-----Welcome-------***");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.println("Enter the serial number of the operation = ");
            choice = sc.nextInt();

            switch(choice) {

                case 1 :
                    System.out.println("The Balance is = "+resMoney);
                    break;
                case 2 : System.out.println("Enter money to deposit = ");
                    enterMoney = sc.nextDouble();
                    if(enterMoney >=0) {
                        resMoney +=  enterMoney;
                        System.out.println("The Deposit is done !!");}
                    else {
                        System.out.println("Warning : Please enter positive amount!!");
                    }
                    break;
                case 3 : System.out.println("Enter money for withdraw = ");
                    enterMoney = sc.nextDouble();
                    if(enterMoney >= 0 && enterMoney <= resMoney) {
                        resMoney -=  enterMoney;
                        System.out.println(enterMoney +" rupees Withdraw");
                    }else {
                        System.out.println("Insufficent Balance can't withdraw enter small value or positive value !! ");
                    }
                    break;
                case 4 : System.out.println("----Exiting ----Thank you !!-----");
                    break;
                default : System.out.println("Please enter a valid input number");

            }

        }while(choice!= 4);
    }


}

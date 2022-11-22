//import java.text.NumberFormat;
import java.util.Scanner;
//import java.text.NumberFormat.*;
    public class ATM extends  Log{

    String input ;
    static double bal = 1000;
    static double amountToDeposit;
    static double amountToWithdraw;


    public void balance() {
        System.out.println("Your Account Balance is " + bal);
    }

    public void deposit() {

        bal += amountToDeposit;
        System.out.println("------------------------------------------------------");
        System.out.println("You have Deposited Rs." + amountToDeposit);
        System.out.println("Your balance is  " + bal);

    }

    public void withdraw() {

        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        if (bal >= amountToWithdraw){
            bal -= amountToWithdraw;
            System.out.println("------------------------------------------------------");
            System.out.println("You have Withdrew " + (amountToWithdraw));
            System.out.println("Your balance is  " + bal);

        }

        else {
            System.out.println("Insufficent Balance! Please enter a valid amount.");

            System.out.println("Your Account balance is  " + bal);
        }

    }
            // MAIN METHOD HERE:
    public void atmStart() {





        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);
        //i<= 3 runs loop till i=3.
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("------------------------------------------------------");
         System.out.println("""
                        Enter:
                        1 for Balance Enquiry
                        2 for Deposit
                        3 for Withdraw
                        4 for Exit Transaction                                                        
                 """ );

            System.out.print("Enter an Option from the List: ");

         int input = sc.nextInt();sc.nextLine();
            System.out.println("------------------------------------------------------");

             if (input == 1) {

                 atm.balance();

             } else if (input == 2) {
                 System.out.print("Enter the amount to Deposit : ");
                 amountToDeposit = sc.nextInt();sc.nextLine();
                 double round = amountToDeposit % 100;
                 if ( round != 0){
                     System.out.println("------------------------------------------------------");
                     System.out.println( " Only Multiples of 100's, 500's and 2000's are accepted!!");
                 }else {
                     atm.deposit();
                 }



             } else if (input == 3) {
                 System.out.print("Enter the amount to Withdraw : ");
                 amountToWithdraw = sc.nextInt();sc.nextLine();
                 double round = amountToWithdraw % 100;

                 if ( round != 0){
                     System.out.println("------------------------------------------------------");
                     System.out.println( " Only Multiples of 100's, 500's and 2000's are accepted!!");
                 }else {
                     atm.withdraw();
                 }

             } else if (input == 4) {
                 System.out.println("ThankYou for using our ATM service ");
                 break;
             }else {
                 System.out.println("Enter an option from the List");
             }

         }


        

    }
}

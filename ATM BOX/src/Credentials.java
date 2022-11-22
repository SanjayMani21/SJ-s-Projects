import java.util.Scanner;
import java.util.Scanner.*;

public class Credentials extends ATM {
    String inputName;
    int inputPin;



    private static String getUser(String x){
        int id  ;
        int age ;

        switch (x) {
            case "sanjay":
                id = 1;
                age= 24;
                System.out.println("HI "+ x );
                System.out.println("ID is " + id);
                System.out.println("Age is " + age);


                break;

            case "aravind":
                id = 2;
                age= 24;
                System.out.println("HI "+ x );
                System.out.println("ID is " + id);
                System.out.println("Age is " + age);

                break;
            case "nithish":
                id = 3;
                age= 23;
                System.out.println("HI "+ x );
                System.out.println("ID is " + id);
                System.out.println("Age is " + age);
        }

        return x;

        }


    public static void main(String[] args) {

        Credentials creds = new Credentials();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username here: ");

        creds.inputName = sc.nextLine();
        //System.out.println(inputName);

        System.out.print("Enter your Pin here: ");

        creds.inputPin = sc.nextInt();sc.nextLine();
        //System.out.println(inputPin);

        String result = getUser(creds.inputName);

        }


    }




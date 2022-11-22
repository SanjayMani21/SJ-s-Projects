import java.util.InputMismatchException;
import java.util.Scanner;


class Create extends Log{


    String username;
    int pass;


    public String getUsername() {

        return username;

    }

    public void setUsername(String username) {

        this.username = username;
    }

    public int getPass() {
        return pass;
    }

    public void setPass() {
        int pin1;
        int pin2;
        String count;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Four Digit  Pin : ");
        pin1 = sc.nextInt();sc.nextLine();

        System.out.print("Reenter Your Four Digit  Pin : ");
        pin2 = sc.nextInt();sc.nextLine();
        System.out.println();


        if (pin1 == pin2) {
            this.pass = pin2;
            System.out.println("""
                    Creating a New Account for you using your credentials.                     
                    Please Wait.
                    Please Wait.
                    Please Wait.   
                    Account Created Successfully                    """);

        } else {
            throw new InputMismatchException("Username or Pin is not same.Please Try again!!!");

        }


    }


    public void Creating(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your New username : ");
        setUsername(sc.nextLine());
        setPass();
        this.pass = getPass();
        this.username = getUsername();
    }
}
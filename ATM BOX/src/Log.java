import java.util.Scanner;

public class Log {
    String user;
    int pass;



    public void Start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println(" Hello Welcome To SJ's ATM Machine");
        System.out.println("------------------------------------------------------");
        System.out.println("""                             
                Select an option:
                1) Create a New Account.
                2) Already a Member. """);
        System.out.println("------------------------------------------------------");
        System.out.print("Enter an option: ");
        int input = sc.nextInt();sc.nextLine();


        if (input == 1){
            System.out.println("------------------------------------------------------");
            String loginId;
            int loginPass;

            Create created = new Create();
            created.Creating();
            user = created.getUsername();
            pass = created.getPass();
            System.out.println("------------------------------------------------------");
            System.out.println("Please Login using your credentials");
            System.out.print("Enter your Username: ");
            loginId = sc.nextLine();
            System.out.print("Enter your Pin: ");
            loginPass = sc.nextInt();sc.nextLine();


            if (loginId.equals(created.getUsername()) && loginPass == created.getPass()) {
                System.out.println("------------------------------------------------------");
                System.out.println("Login Successful");


                ATM atmstart = new ATM();

                atmstart.atmStart();

            }
            else {
                System.out.println("Error Trying to login ");
            }
        }else if (input ==2) {
            LogIn();
        }else {
            System.out.println();
        }

    }


    public void LogIn(){

        String loginId;
        int loginPass;
        Scanner sc = new Scanner(System.in);
        Create created = new Create();
        System.out.println("------------------------------------------------------");
        System.out.println("Hello Welcome To SJ's ATM Machine");
        System.out.println("------------------------------------------------------");

        System.out.print("Enter your username: ");
        loginId = sc.nextLine();
        System.out.print("Enter your Pin: ");
        loginPass = sc.nextInt();sc.nextLine();


        if (loginId.equals(created.getUsername()) && loginPass == created.getPass()) {

            System.out.println("Login Successful");
            ATM atmstart = new ATM();

            atmstart.atmStart();

        } else {
            System.out.println("------------------------------------------------------");
            System.out.println(" No Account Found !!. Create a New account");
            System.out.println("------------------------------------------------------");

            Start();




        }

    }

    public static void main(String[] args) {
       // Log log = new Log();
       // log.LogIn();
        Create create = new Create();

        create.Start();

    }

}
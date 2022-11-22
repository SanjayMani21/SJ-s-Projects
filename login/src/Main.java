import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String pass1;
        String pass2;
        Scanner sc = new Scanner(System.in);

        User user = new User();

        System.out.println("Enter name");
        user.name = sc.nextLine();

        System.out.println("Enter Password");
        pass1 = sc.nextLine();

        System.out.println("Confirm Password");
        pass2 = sc.nextLine();

        if (pass1.equals(pass2)) {
            user.pass = pass2;
        } else {
            System.out.println("Password Mismatch");
        }
        FileOutputStream fos = new FileOutputStream("C:\\Users\\sanja\\Desktop\\res\\practice.txt");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(user);
        out.close();
        fos.close();

        System.out.println("Completed Serialization");
    }
}

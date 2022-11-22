import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;

        FileInputStream fis = new FileInputStream("C:\\Users\\sanja\\Desktop\\res\\practice.txt");

        ObjectInputStream in = new ObjectInputStream(fis);
        user = (User)in.readObject();
        in.close();
        fis.close();

        System.out.println("Reading");

        System.out.println(user.name);

        System.out.println(user.pass);
    }

}

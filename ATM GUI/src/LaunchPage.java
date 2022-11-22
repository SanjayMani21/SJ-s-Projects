import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage extends Create implements ActionListener {
    private void callCreate(){
        System.out.println( "hi");
        new Create();
    }

    //Input Data Stored
    String username;
    char[] password;


    JFrame frame = new JFrame();
    JTextField usernameField = new JTextField(15);
    JPasswordField passwordField = new JPasswordField(15);
    JLabel usernameLabel = new JLabel("UserName");


    JLabel passwordLabel = new JLabel("Password");
    JLabel blank = new JLabel();
    JPanel panel1 = new JPanel();
    JButton loginButton = new JButton("Login");
    JButton createNewAccountButton = new JButton("Create New Account");


    LaunchPage() {

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("ATM LOGIN");
        frame.setLayout(new FlowLayout());


        usernameField.setHorizontalAlignment(SwingConstants.CENTER);
        passwordField.setHorizontalAlignment(SwingConstants.CENTER);
        usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);

        panel1.setLayout(new GridLayout(3, 1));
        panel1.setBackground(Color.gray);


        panel1.add(usernameLabel);
        panel1.add(usernameField);
        panel1.add(passwordLabel);
        panel1.add(passwordField);

        panel1.add(createNewAccountButton);
        panel1.add(loginButton);
        loginButton.addActionListener(this);
        createNewAccountButton.addActionListener(this);


        frame.add(panel1);
        frame.pack();
        frame.setResizable(false);

        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {

            username = usernameField.getText();
            password = passwordField.getPassword();
            System.out.println(username);
            System.out.println(password);
        } else if (e.getSource() == createNewAccountButton) {

            createNewAccountButton.setEnabled(false);
            Create create = new Create();
            create.Create();
           //callCreate();
        }
    }
}

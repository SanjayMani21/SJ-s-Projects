import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class Create  implements ActionListener {

    String username;
    String pass1;
    String pass2;
    String password;

    JFrame frame = new JFrame();
    JTextField usernameField = new JTextField(15);
    JPasswordField passwordField = new JPasswordField("Enter Password",15);
    JPasswordField passwordField1 = new JPasswordField("Renter Password",15);
    JLabel usernameLabel = new JLabel("New Username");


    JLabel passwordLabel = new JLabel("New Password");
    JLabel passwordLabel1 = new JLabel("ReEnter New Password");
    JLabel blank = new JLabel();
    JPanel panel1 = new JPanel();
    JButton createButton = new JButton("Create");


    public void Create() {

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Create New Account");
        frame.setLayout(new FlowLayout());


        usernameField.setHorizontalAlignment(SwingConstants.CENTER);
        passwordField.setHorizontalAlignment(SwingConstants.CENTER);
        usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
        passwordLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        passwordField1.setHorizontalAlignment(SwingConstants.CENTER);



        panel1.setLayout(new GridLayout(4, 1));
        panel1.setBackground(Color.white);


        panel1.add(usernameLabel);
        panel1.add(usernameField);
        panel1.add(passwordLabel);
        panel1.add(passwordField);
        panel1.add(passwordLabel1);
        panel1.add(passwordField1);

        panel1.add(blank);
        panel1.add(createButton);
        createButton.addActionListener(this);


        frame.add(panel1);
        frame.pack();
        frame.setResizable(false);

        frame.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createButton){
            username = usernameField.getText();
            pass1 = Arrays.toString(passwordField.getPassword());
            pass2 = Arrays.toString(passwordField1.getPassword());

            if (pass1 .equals(pass2) ){
                password = pass2;
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                new LaunchPage();



                }else{
                JOptionPane.showMessageDialog(null,"Error!! \n Passwords are not  same. Try Again.","error",JOptionPane.ERROR_MESSAGE);

            }

        }else {
        }

    }
}

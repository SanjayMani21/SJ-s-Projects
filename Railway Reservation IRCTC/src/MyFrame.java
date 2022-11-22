import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MyFrame extends JFrame {

    JPanel headPanel = new JPanel();
    JPanel bodyPanel = new JPanel();
    JLabel headLabel = new JLabel("IRCTC BOOKING PAGE ");
    JLabel nameLabel = new JLabel("Name:  ");
    JLabel ageLabel = new JLabel("Age: ");
    JLabel genderLabel = new JLabel("Gender:");
    JLabel berthLabel = new JLabel("Berth: ");
    JLabel maleLabel = new JLabel("Male  ");
    JLabel femaleLabel = new JLabel("Female  ");
    JTextField nameField = new JTextField(15);
    JTextField ageField = new JTextField(2);

    JCheckBox maleGenderBox = new JCheckBox();
    JCheckBox femaleGenderBox = new JCheckBox();

    MyFrame() {
        this.setTitle("IRCTC BOOKING");
        this.setSize(new Dimension(600, 600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);


        headPanel.setBounds(0, 0, 600, 50);
        headPanel.setLayout(new GridBagLayout());
        headPanel.setBackground(Color.black);
        headPanel.setOpaque(true);


        headLabel.setFont(new Font("Mv Boli", Font.PLAIN, 25));
        headLabel.setForeground(Color.red);
        headPanel.add(headLabel);

        bodyPanel.setBounds(0, 50, 280, 550);
        bodyPanel.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
        bodyPanel.setBackground(Color.cyan);
        bodyPanel.setOpaque(true);

        bodyPanel.add(nameLabel);
        nameLabel.setFont(new Font("MONOSPACED", Font.BOLD, 15));
        bodyPanel.add(nameField);


        bodyPanel.add(ageLabel);
        ageLabel.setFont(new Font("MONOSPACED",Font.BOLD,15));
        bodyPanel.add(ageField);

        bodyPanel.add(genderLabel);
        genderLabel.setFont(new Font("MONOSPACED",Font.BOLD,15));
        bodyPanel.add(maleLabel);
        maleLabel.setFont(new Font("MONOSPACED",Font.BOLD,15));
        bodyPanel.add(maleGenderBox);
        bodyPanel.add(femaleLabel);
        femaleLabel.setFont(new Font("MONOSPACED",Font.BOLD,15));
        bodyPanel.add(femaleGenderBox);
        bodyPanel.add(berthLabel);



        this.add(headPanel);
        this.add(bodyPanel);
        this.setVisible(true);

    }

}

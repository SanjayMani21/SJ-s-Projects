import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicketBooking extends JFrame implements ActionListener {
    String gender ;
    private JTextField nameTextField;
    private JTextField ageTextField;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JRadioButton otherRadioButton;
    private JComboBox berthComboBox;
    private JLabel headLabel;
    private JLabel nameLabel;
    private JLabel ageLabel;
    private JLabel genderLabel;
    private JLabel berthLabel;
    private JPanel mainPanel;
    private JButton submitButton;
    JOptionPane optionPane = new JOptionPane(javax.swing.UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("MONOSPACED", Font.BOLD, 20))));

    TicketBooking() {
        this.setTitle("Booking App");
        this.setSize(new Dimension(500, 500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);


        this.add(mainPanel);
        this.pack();
        this.setVisible(true);
        submitButton.addActionListener(this);
    }

    public void Output(){
        if (maleRadioButton.isSelected()){
            gender = "Male";
        } else if (femaleRadioButton.isSelected()) {
            gender = "Female";
        } else if (otherRadioButton.isSelected()) {
            gender = "Other";
        }
        berthComboBox.getItemAt(0);


                JOptionPane.showMessageDialog(null, "Confirm Your Booking Details : \n" +
                "Name: "+nameTextField.getText().toUpperCase()
                + "\n" +
                "AGE: " + ageTextField.getText()
                + "\n" +
                "Gender: " +gender
                + "\n" +
                "Berth Preference: " + berthComboBox.getSelectedItem());



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitButton){
            if (nameTextField.getText().isEmpty() || ageTextField.getText().isEmpty()  ){
                if (gender==null) {
                    JOptionPane.showMessageDialog(null, "FILL THE DETAILS AND TRY AGAIN!!!");
                }

            }else{
                Output();
            }


        }

    }
}

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Token extends  JFrame{
    private JPanel mainPanel;
    private JButton Button;
    private JLabel headLabel;

    JOptionPane optionPane = new JOptionPane(javax.swing.UIManager.put("OptionPane.messageFont",new FontUIResource(new Font("MV Boli",Font.BOLD,20)))); // parameter passed to change font of Message dialog

    int tokenNo = 1;
    public void Generate(){
        if (tokenNo <=50){
            JOptionPane.showMessageDialog(optionPane,"Token no is " + tokenNo + "\n Kindly Visit the Hospital at 4pm");
            optionPane.setForeground(Color.MAGENTA);
            tokenNo++;
        }
    }
    Token(){
        this.setSize(new Dimension(500,500));
        this.setContentPane(mainPanel);
        this.setResizable(false);

        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);





        Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Button){
                    Generate();
                }
            }
        });
    }
}

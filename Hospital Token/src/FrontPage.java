import javax.swing.*;
import java.awt.*;

public class FrontPage {
    JFrame frame = new JFrame();
    JPanel contentPanel1 = new JPanel();

    JLabel panelLabel = new JLabel("Hospital Token Generator");
    JButton pressButton = new JButton("Press To Generate");


    public void Start() {
        frame.setSize(400, 200);
        frame.setTitle("Hospital Token Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(new FlowLayout());

        contentPanel1.setPreferredSize(new Dimension( 600,100));
        contentPanel1.setLayout(null);
        contentPanel1.setBorder(BorderFactory.createLineBorder(Color.red,3));
        contentPanel1.setBackground(Color.gray);
        contentPanel1.setOpaque(true);

        panelLabel.setBounds(0,0,600,100);
        panelLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
        panelLabel.setForeground(Color.yellow);
        panelLabel.setVerticalAlignment(SwingConstants.CENTER);
        panelLabel.setHorizontalAlignment(SwingConstants.CENTER);


        pressButton.setBounds(200,150,100,100);




        frame.add(contentPanel1);
        contentPanel1.add(panelLabel);
        frame.add(pressButton);


        frame.setVisible(true);


    }


}

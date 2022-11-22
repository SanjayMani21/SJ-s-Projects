import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

public class FrontPage implements MouseListener {
    int count = 1;

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

        contentPanel1.setPreferredSize(new Dimension(600, 100));
        contentPanel1.setLayout(null);
        contentPanel1.setBorder(BorderFactory.createLineBorder(Color.red, 3));
        contentPanel1.setBackground(Color.gray);
        contentPanel1.setOpaque(true);


        panelLabel.setBounds(0, 0, 600, 100);
        panelLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
        panelLabel.setForeground(Color.yellow);
        panelLabel.setVerticalAlignment(SwingConstants.CENTER);
        panelLabel.setHorizontalAlignment(SwingConstants.CENTER);


        pressButton.setBounds(200, 150, 100, 100);
        pressButton.isDefaultButton();

        pressButton.addMouseListener(this);


        frame.add(contentPanel1);
        frame.setResizable(false);
        contentPanel1.add(panelLabel);
        frame.add(pressButton);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);


    }

    private void Generate() {
        TokenData data = new TokenData();


        if (count <= 5) {
            System.out.println("hi");
            JOptionPane.showMessageDialog(null, "Your token No is " + count, "Take Your Token", JOptionPane.INFORMATION_MESSAGE);



        } else {

            JOptionPane.showMessageDialog(null, "Token is Over" + count, "Sorry, Please Contact Admin for more info", JOptionPane.WARNING_MESSAGE);
        }


    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == pressButton) {
            panelLabel.setText("Generate Your Token ...");
            Generate();
            count += 1;

        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}


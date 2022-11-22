import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JustAgree extends JFrame implements MouseListener {
    int ans;
    private JButton yesButton;
    private JButton noButton;
    private JLabel qLabel;
    private JPanel mainPanel1;
    private JPanel mainPanel;



    JustAgree(){
        this.setTitle("Just Agree");
        this.setSize(700,700);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        noButton.addMouseListener(this);
        yesButton.addMouseListener(this);



        this.setLocationRelativeTo(null);
        this.add(mainPanel);
        this.setVisible(true);


    }

    public void  Run(){
        int maxW = mainPanel1.getWidth()-100;
        int maxH = mainPanel1.getHeight()-100;
        int minW = 0;
        int minH = 0;

        int rangeX = maxW-minW;
        int rangeY = maxH-minH;


        for (int i = 0; i < 10; i++) {

            int randomX = (int) (Math.random() * rangeX) + minW;
            int randomY = (int) (Math.random() * rangeX) + minH;

            noButton.setLocation(randomX,randomY);
            System.out.println(randomX);
            System.out.println(randomY);

        }






    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }


    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == yesButton){
           ans = JOptionPane.showConfirmDialog(null,"Are You Suree Betaa");

            if (ans == 0){

                ImageIcon imageIcon = new ImageIcon("C:\\Users\\sanja\\IdeaProjects\\JUSTAGREE\\src\\akshay-kumar-funny-expression.jpg");
                JLabel label = new JLabel(imageIcon);

                label.setBounds(-1,0,700,350);
                this.setSize(700,400);
                mainPanel1.setLayout(null);
                mainPanel1.add(label);
                yesButton.setVisible(false);
                noButton.setVisible(false);
                qLabel.setText("I Knew ");
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            }else {
                qLabel.setText("I Knew");
            }
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == noButton){

            Run();
        } else if (e.getSource() == yesButton) {
            qLabel.setText("Ahhhh!!!! \n So You Finally Understood.. ");
            qLabel.setForeground(Color.blue);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
            if (e.getSource() == yesButton) {
            qLabel.setText("So Sad... Keep Trying Nothing is Impossible IDIOT !!! ");
            qLabel.setForeground(Color.red);
            if (ans==0){
                qLabel.setText("I Knew");
            }

              }
            }
    }


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class AgreeOrNot extends JFrame implements MouseListener {
    private JPanel mainPanel;
    private JButton noButton;

    AgreeOrNot(){
        mainPanel.setPreferredSize(new Dimension(500,500));
        mainPanel.setBackground(Color.cyan);
        mainPanel.setOpaque(true);

        noButton.setFocusable(false);
        noButton.addMouseListener(this);

        this.add(mainPanel);


        this.setSize(new Dimension(500,500));
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

    public void Run(){
        int maxH = mainPanel.getHeight()-100;
        int maxW = mainPanel.getWidth()-100;
        int minH = 0;
        int minW = 0;
        int rangeX = maxW -minW;
        int rangeY = maxH - minH;
        int randomW= 0;
        int randomH = 0;
        for (int i = 0; i <=10 ; i++) {
            randomW = (int) (Math.random()*rangeX)+0;
            randomH = (int) (Math.random()*rangeY)+0;
        }
        System.out.println(randomW);
        System.out.println(randomH);
        noButton.setLocation(randomW,randomH);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == noButton){

           Run();




        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

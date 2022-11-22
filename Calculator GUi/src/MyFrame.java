import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    double a;
    double b;
    double ans;
    String operation;
    int Width_Frame = 300;

    int Height_Frame = 300;
    JTextField field, store;
    JPanel mainPanel = new JPanel();

    JButton bce, bdel, bper, b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, bmul, bdiv, bsub, bequals, bdecimal, bexp;

    MyFrame() {
        this.setTitle("Calculator GUI");
        this.setSize(new Dimension(Width_Frame, Height_Frame));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        mainPanel.setPreferredSize(new Dimension(270, Height_Frame));
        mainPanel.setLayout(new FlowLayout());


        field = new JTextField(null);
        field.setEditable(false);
//        field.setBackground(Color.gray);
        field.setHorizontalAlignment(SwingConstants.RIGHT);
        field.setFont(new Font("", Font.BOLD, 15));
        field.setPreferredSize(new Dimension(260, 30));

        store = new JTextField(null);
        store.setEditable(false);
//        store.setBackground(Color.gray);
        store.setHorizontalAlignment(SwingConstants.RIGHT);
        store.setFont(new Font("", Font.BOLD, 15));
        store.setPreferredSize(new Dimension(100, 25));


        //number buttons

        b1 = new JButton("1");
        b1.setPreferredSize(new Dimension(60, 40));
        b1.addActionListener(this);
        b2 = new JButton("2");
        b2.setPreferredSize(new Dimension(60, 40));
        b2.addActionListener(this);
        b3 = new JButton("3");
        b3.setPreferredSize(new Dimension(60, 40));
        b3.addActionListener(this);
        b4 = new JButton("4");
        b4.setPreferredSize(new Dimension(60, 40));
        b4.addActionListener(this);
        b5 = new JButton("5");
        b5.setPreferredSize(new Dimension(60, 40));
        b5.addActionListener(this);
        b6 = new JButton("6");
        b6.setPreferredSize(new Dimension(60, 40));
        b6.addActionListener(this);
        b7 = new JButton("7");
        b7.setPreferredSize(new Dimension(60, 40));
        b7.addActionListener(this);
        b8 = new JButton("8");
        b8.setPreferredSize(new Dimension(60, 40));
        b8.addActionListener(this);
        b9 = new JButton("9");
        b9.setPreferredSize(new Dimension(60, 40));
        b9.addActionListener(this);
        b0 = new JButton("0");
        b0.setPreferredSize(new Dimension(60, 40));
        b0.addActionListener(this);


        //operator buttons
        add = new JButton("+");
        add.setPreferredSize(new Dimension(60, 40));
        add.addActionListener(this);

        bsub = new JButton("-");
        bsub.setPreferredSize(new Dimension(60, 40));
        bsub.addActionListener(this);
        bmul = new JButton("*");
        bmul.setPreferredSize(new Dimension(60, 40));
        bmul.addActionListener(this);
        bdiv = new JButton("/");
        bdiv.setPreferredSize(new Dimension(60, 40));
        bdiv.addActionListener(this);
        bper = new JButton("%");
        bper.setPreferredSize(new Dimension(60, 40));
        bper.addActionListener(this);

        //Equals button
        bequals = new JButton("=");
        bequals.setPreferredSize(new Dimension(60, 40));
        bequals.addActionListener(this);
        //Decimal point Button
        bdecimal = new JButton(".");
        bdecimal.setPreferredSize(new Dimension(60, 40));
        bdecimal.addActionListener(this);
        //Exponential Buttons
        bexp = new JButton("EXP");
        bexp.setPreferredSize(new Dimension(60, 40));
        bexp.addActionListener(this);
        //Clear Functions
        bce = new JButton("C");
        bce.setPreferredSize(new Dimension(60, 40));
        bce.addActionListener(this);

        bdel = new JButton("Del");
        bdel.setPreferredSize(new Dimension(60, 40));
        bdel.addActionListener(this);

        mainPanel.add(store, RIGHT_ALIGNMENT);
        mainPanel.add(field);

        //mainPanel.badd(bce);
        mainPanel.add(bce);
        mainPanel.add(bdel);
        mainPanel.add(bper);
        mainPanel.add(bdiv);


        mainPanel.add(b1);
        mainPanel.add(b2);
        mainPanel.add(b3);

        mainPanel.add(bsub);


        mainPanel.add(b4);
        mainPanel.add(b5);
        mainPanel.add(b6);

        mainPanel.add(bmul);

        mainPanel.add(b7);
        mainPanel.add(b8);
        mainPanel.add(b9);

        mainPanel.add(add);
        mainPanel.add(bdecimal);
        mainPanel.add(b0);
        mainPanel.add(bexp);


        mainPanel.add(bequals);


        this.add(mainPanel);
        this.pack();
        this.setVisible(true);


    }

    public void Addition() {
        double sum = 0;
        operation = "+";


        b = Double.parseDouble(field.getText());
        store.setText(String.valueOf(b));
        b = 0;
        a += Double.parseDouble(store.getText());
        field.setText(null);


        sum = a + b;
        store.setText(String.valueOf(sum));

        System.out.println("sum is " + sum);
        System.out.println(a);
        System.out.println(b);


    }

    public void Subtraction() {
        double subtract = 0;
        operation = "-";

        b = Double.parseDouble(field.getText());
        store.setText(String.valueOf(b));
        b = 0;
        a += Double.parseDouble(store.getText());
        field.setText(null);


        subtract = a - b;
        store.setText(String.valueOf(subtract));

        System.out.println("sum is " + subtract);
        System.out.println(a);
        System.out.println(b);
    }

    public void Multiplication() {
        double multiply = 1;
        operation = "*";
        a = 1;
        b = Double.parseDouble(field.getText());
        System.out.println("b is " + b);
        store.setText(String.valueOf(b));
        b = 1;
        a *= Double.parseDouble(store.getText());
        field.setText(null);


        multiply = a * b;
        store.setText(String.valueOf(multiply));

        System.out.println("sum is " + multiply);
        System.out.println(a);
        System.out.println(b);
    }


    public void Division() {
        double divide = 1;

        operation = "/";
        a = 1;
        b = Double.parseDouble(field.getText());
        System.out.println("b is " + b);
        store.setText(String.valueOf(b));
        b = 1;
        a *= Double.parseDouble(store.getText());
        field.setText(null);


        divide = a / b;
        store.setText(String.valueOf(divide));

        System.out.println("sum is " + divide);
        System.out.println(a);
        System.out.println(b);

    }

    public void Percentage() {
        double percentage = 1;

        operation = "%";
        a = 1;
        b = Double.parseDouble(field.getText());
        System.out.println("b is " + b);
        store.setText(String.valueOf(b));
        b = 1;
        a *= Double.parseDouble(store.getText());
        field.setText(null);


        percentage = a / 100;
        store.setText(String.valueOf(percentage));

        System.out.println("sum is " + percentage);
        System.out.println(a);
        System.out.println(b);

    }

    public void Delete() {
        String answer = field.getText();
        System.out.println(answer);
        StringBuilder sb = new StringBuilder(answer);   // creating Sting Builder and gibing parameter as the value shown in calc display.
        StringBuilder val = sb.deleteCharAt(answer.length() - 1);             // deleting the last char from the answer variable. * -1 is because .length
        // calculates from 1 and Java reads from index 0. So -1 corrects the length of the word.
        field.setText(String.valueOf(val));                       //Converting back to String.

    }




    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == b1) {
            field.setText(field.getText() + 1);
        } else if (e.getSource() == b2) {
            field.setText(field.getText() + 2);
        } else if (e.getSource() == b3) {
            field.setText(field.getText() + 3);
        } else if (e.getSource() == b4) {
            field.setText(field.getText() + 4);
        } else if (e.getSource() == b5) {
            field.setText(field.getText() + 5);
        } else if (e.getSource() == b6) {
            field.setText(field.getText() + 6);
        } else if (e.getSource() == b7) {
            field.setText(field.getText() + 7);
        } else if (e.getSource() == b8) {
            field.setText(field.getText() + 8);
        } else if (e.getSource() == b9) {
            field.setText(field.getText() + 9);
        } else if (e.getSource() == b0) {
            field.setText(field.getText() + 0);
        } else if (e.getSource() == add) {

            while (true) {
                Addition();
            }

        } else if (e.getSource() == bsub) {
            while (true) {
                Subtraction();
            }

        } else if (e.getSource() == bmul) {
            while (true) {
                Multiplication();
            }

        } else if (e.getSource() == bsub) {
            while (true) {
                Subtraction();
            }

        } else if (e.getSource() == bdiv) {
            while (true) {
                Division();
            }
        } else if (e.getSource() == bce) {
            a = 0;
            b = 0;
            ans = 0;
            operation = null;
            field.setText(null);
            store.setText(null);
        } else if (e.getSource() == bdecimal) {
            field.setText(field.getText() + ".");


        } else if (e.getSource() == bequals) {
            if (operation.equals("+")) {
                b = Double.parseDouble(field.getText());

                ans = a + b;
                a = 0;
                b = 0;
                field.setText(String.valueOf(ans));
                store.setText(null);

            } else if (operation.equals("-")) {
                b = Double.parseDouble(field.getText());

                ans = a - b;
                a = 0;
                b = 0;
                field.setText(String.valueOf(ans));
                store.setText(null);

            } else if (operation.equals("*")) {
                b = Double.parseDouble(field.getText());
                a = Double.parseDouble(store.getText());
                System.out.println(a);
                System.out.println(b);
                ans = a * b;
                a = 0;
                b = 0;
                field.setText(String.valueOf(ans));
                store.setText(null);

            } else if (operation.equals("/")) {
                b = Double.parseDouble(field.getText());
                a = Double.parseDouble(store.getText());
                System.out.println(a);
                System.out.println(b);
                ans = a / b;
                a = 0;
                b = 0;
                field.setText(String.valueOf(ans));
                store.setText(null);
                System.out.println(ans);
            }

        } else if (e.getSource() == bper) {
            Percentage();
        } else if (e.getSource() == bdel) {
            Delete();
        }/* else if (e.getSource() == bexp) {
            Exponential();

        }*/
    }
}


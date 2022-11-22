import javax.swing.*;

public class Wallet {

    double balance;
    int withdraw;
    int deposit;

    void Start(){
        JOptionPane.showMessageDialog(null, "Hi Welcome to Sj's Wallet" + "\n" +"Subscribe to SJ VLOGS Channel", "Welcome", JOptionPane.INFORMATION_MESSAGE);
        while (true) {
            String[] response = {"Balance", "Deposit", "Withdraw", "Exit"};
            int userInput = JOptionPane.showOptionDialog(
                    null,
                    "What would you like to do?",
                    "Wallet",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    response,
                    0);

            if (userInput == 0) {
                Balance();
            } else if (userInput == 1) {
                Deposit();
            } else if (userInput == 2) {
                WithDraw();
            } else if (userInput == 3) {
                JOptionPane.showMessageDialog(null,"ThankYou for using This app \n Created By - SJCodes");
                break;
            }else {
                break;
            }
        }

    }
    void Balance(){
        JOptionPane.showMessageDialog(null,"Your balance is: Rs " + Math.round(balance));

    }

    void Deposit(){
       deposit = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your Deposit Amount: "));
            balance += deposit;
            JOptionPane.showMessageDialog(null,"Your Balance is: Rs " + Math.round(balance));
       }




    void WithDraw(){
        withdraw = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the amount to Withdraw: ",0));
        if(balance > withdraw){
            balance -= withdraw;
            JOptionPane.showMessageDialog(null,"Your Balance is: Rs " + Math.round(balance));
        }else {
            JOptionPane.showMessageDialog(null,"Insufficient Balance. \n Your Balance is: Rs " + Math.round(balance));
        }



    }

    public static void main(String[] args) {
        Wallet wallet = new Wallet();
       wallet.Start();
    }




    }
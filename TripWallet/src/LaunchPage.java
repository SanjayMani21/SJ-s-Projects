import javax.swing.*;

public class LaunchPage {
    void Launch() {
        Wallet wallet = new Wallet();
        FuelCalculator fuelCalculator = new FuelCalculator();
        JOptionPane.showMessageDialog(null, "Hi Welcome to Sj's Trip Wallet App" + "\n" + "Subscribe to SJ VLOGS Channel", "Trip Wallet", JOptionPane.INFORMATION_MESSAGE);
        while (true) {
            String[] response = {"Wallet", "Fuel Calculator", "Exit"};
            int userInput = JOptionPane.showOptionDialog(
                    null,
                    "What would you like to use?",
                    "Welcome",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    response,
                    0);

            if (userInput == 0) {
                wallet.Start();
            } else if (userInput == 1) {
                fuelCalculator.Start();
            } else if (userInput == 2) {
                JOptionPane.showMessageDialog(null, "ThankYou for using This app \n Created By - SJCodes");
                break;
            } else {
                break;
            }
        }

    }


}





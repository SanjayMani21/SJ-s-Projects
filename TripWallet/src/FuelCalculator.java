
import javax.swing.*;

public class FuelCalculator {
    int travel_distance;
    double fuelrate;
    double mileage;

    double requiredFuel;
    double requiredCash;
    double safetyFuel = 50.0;

    void Start() {

        FuelCalculator fuelCalculator = new FuelCalculator();
        fuelCalculator.InputDetails();
        fuelCalculator.Calculate();
    }
    //_________________________________________________________________________________________________________________

    void InputDetails() {


        JOptionPane.showMessageDialog(null, "Hi Welcome to Sj's Fuel Calculator. \n Subscribe to SJ VLOGS CHANNEL ", "Welcome", JOptionPane.INFORMATION_MESSAGE);
        String[] response = {"One-Way", "Two-Way"};

        int travel_type = JOptionPane.showOptionDialog(
                null,
                "Is it for One Way or Two Way",
                "Travel Type",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                response,
                0);

        if (travel_type == 0) {

            travel_distance = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Destination Distance in kms", " One Way Travel Distance", JOptionPane.INFORMATION_MESSAGE));
            System.out.println("Your 1 way Travelling distance is: " + travel_distance);
            travel_distance += safetyFuel;
            System.out.println("Your 1 way Travelling distance  with safety fuel is: " + travel_distance);
            //_________________________________________________________________________________________________________________
            fuelrate = Double.parseDouble(JOptionPane.showInputDialog(null,     "Enter the current price of Fuel in Rs ", "Fuel Rate", JOptionPane.QUESTION_MESSAGE));
            System.out.println("Current Rate of fuel is: " + fuelrate);
            //_________________________________________________________________________________________________________________
            mileage = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the mileage of the Vehicle in kmpl", "Mileage", JOptionPane.INFORMATION_MESSAGE));
            System.out.println("Mileage of your vehicle is: " + mileage);

        } else if (travel_type == 1) {

            travel_distance = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter only the Destination Distance in kms", " Two Way Travel Distance", JOptionPane.INFORMATION_MESSAGE));
            travel_distance = travel_distance * 2;
            System.out.println("Your 2 way Travelling distance is: " + travel_distance);
            travel_distance += safetyFuel;
            System.out.println("Your 2 way Travelling distance with safety fuel is: " + travel_distance);
            //_________________________________________________________________________________________________________________
            fuelrate = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the current price of Fuel in Rs ", "Fuel Rate", JOptionPane.QUESTION_MESSAGE));
            System.out.println("Current Rate of fuel is: " + fuelrate);
            //_________________________________________________________________________________________________________________
            mileage = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the mileage of the Vehicle in kmpl;", "Mileage", JOptionPane.INFORMATION_MESSAGE));
            System.out.println("Mileage of your vehicle is: " + mileage);

        } else {
            System.out.println("Error");
        }


    }

    private void Calculate() {
        requiredFuel = (travel_distance / mileage);
        //System.out.println("Required quantity of fuel is: " + Math.round(requiredFuel) + " litres");

        requiredCash = (requiredFuel * fuelrate);
        //System.out.println("Required cash in hand for fuel is: Rs." + Math.round(requiredCash));
        JOptionPane.showMessageDialog(null, "Required cash  for fuel is: Rs." + Math.round(requiredCash) + "\n" + ("Required quantity of fuel is: " + Math.round(requiredFuel) + " litres") + "\n\n" + "Created By - SJCodes", "Report", JOptionPane.INFORMATION_MESSAGE);

    }
}
import java.util.Scanner;

public class EConsumption {

    public static String twoDigitsAtferComma(double number) {
        String str = String.format("%.2f", number);
        return str;
    }

    public static String fourDigitsAtferComma(double number) {
        String str = String.format("%.4f", number);
        return str;
    }

    public static void main(String[] args) {
        double fuelConsumptionCalculation;
        double oilConsumptionCalculation;

        double fuelConsumption = 6.8 / 100;
        double oilConsumption = 0.5 / 1000;

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter the distance (in km): ");
            double input = s.nextDouble();

            fuelConsumptionCalculation = fuelConsumption * input;
            oilConsumptionCalculation = oilConsumption * input;            

            System.out.println("Your fuelconsumption is " + fourDigitsAtferComma(fuelConsumptionCalculation)
                    + " liters per kilometer");
            System.out.println("Your oilconsumption is " + fourDigitsAtferComma(oilConsumptionCalculation)
                    + " liters per kilometer");
            double fuelConsumptionPriceCalculation = fuelConsumptionCalculation * 1.207;
            double oilConsumptionPriceCalculation = oilConsumptionCalculation * (37.47 / 5);
            System.out.println("Your fuelconsumption costs " + twoDigitsAtferComma(fuelConsumptionPriceCalculation)
                    + " Euro");
            System.out.println("Your oilconsumption costs " + twoDigitsAtferComma(oilConsumptionPriceCalculation)
                    + " Euro");
            System.out.println("");
        }
    }
}

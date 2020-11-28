import java.util.Scanner;

public class GPizzaPriceCalculator {
    public static String twoDigitsAtferComma(double number) {
        String str = String.format("%.2f", number);
        return str;
    }

    public static void main(String[] args) {

        double emptyPizzaPrice = 6.50;
        double pizzaToppingPrice = 0.50;
        double tmp = 0;
        int pizzaCount = 0;
        int pizzaToppingCount = 0;
        char endOption = 'y';

        while (endOption == 'y') {
            pizzaCount++;
            Scanner s = new Scanner(System.in);
            System.out.println("How many pizza toppings do you want at this pizza?");
            int input = s.nextInt();
            pizzaToppingCount = pizzaToppingCount + input;
            double calculatePrice = (input * pizzaToppingPrice) + emptyPizzaPrice;

            tmp = tmp + calculatePrice;
            System.out
                    .println("Current costs for " + pizzaCount + " pizzas and " + pizzaToppingCount + " toppings: " + twoDigitsAtferComma(tmp) + "  Euro");
            System.out.println("Do you want one more pizza?(y/n)");
            char inputChar = s.next().charAt(0);
            endOption = inputChar;
        }

        System.out.println("This will cost you " + twoDigitsAtferComma(tmp) + " Euro");

    }

}

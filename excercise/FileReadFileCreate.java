import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FileReadFileCreate {
    public static void main(String[] args) throws InterruptedException {
        File fileName = new File("input.txt");
        Scanner readFile = new Scanner("");
        Scanner s = new Scanner(System.in);
        System.out.println("\nFilereader");
        System.out.print("Die Datei " + "\"" + fileName + "\"" + " wird gesucht .");
        int counter = 5;

        while (counter > 0) {
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            counter--;
        }
        System.out.println();
        try {
            readFile = new Scanner(fileName);
        } catch (FileNotFoundException expceptionVariable1) {
            System.out.println("Error - Datei existiert nicht!");
            try {
                System.out.println("Soll die Datei erstellt werden?(Y|N)");
                String input = s.next();
                if (input.equals("y") || input.equals("Y")) {
                    fileName.createNewFile();
                    System.out.println("\nFilecreater");
                    System.out.print("Die Datei " + fileName + " wird erstellt .");
                    counter = 5;
                    while (counter > 0) {
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        counter--;
                    }
                    System.out.println("\nDie Datei " + fileName + " wurde erstellt!");
                    System.exit(0);
                } else{
                    System.exit(0);
                }
            } catch (IOException expceptionVariable2) {
                expceptionVariable2.printStackTrace();
            }
        }
        System.out.print("Die Datei " + "\"" + fileName + "\"" + " wird gelesen .");
        counter = 5;
        while (counter > 0) {
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            counter--;
        }
        System.out.println();
        System.out.print("Dateianfang {\n");
        System.out.println();
        while (readFile.hasNextLine()) {
            String data = readFile.nextLine();
            System.out.println(data);
        }
        System.out.println();
        System.out.print("} Dateiende erreicht");
        readFile.close();
    }
}

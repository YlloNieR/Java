import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MyDecoder {

    public static void readFile(int option, String fileName) {
        
        try {     
            ArrayList<String> allLinesRead = new ArrayList<>(Files.readAllLines(Paths.get(fileName)));

            switch (option) {
                case 1:
                    System.out.println("Typ Array: " + allLinesRead);
                    binaryToText(allLinesRead);
                    break;
            }
        } catch (IOException e) {
            System.out.println("Ein Fehler ist aufgetreten!");
            e.printStackTrace();
        }
    }

    public static void binaryToText(ArrayList<String> data) {
        for (int i = 0; i < data.size(); i++) {
            int binary = Integer.valueOf(data.get(i));
            System.out.println("Typ Int: " + binary);
            int decimal = Integer.parseInt(data.get(i), 2);
            System.out.println("Typ decimal: " + decimal);
            char charakter = (char) decimal;
            if (charakter < 21) {
                System.out.println("Typ ASCII: " + "kein Buchstabe");
            } else {
                System.out.println("Typ ASCII: " + charakter);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\nGeben Sie die Datei (Bsp.: asd.txt) an, welche sich im selben Ordner befindet:");
        String fileName = s.next();
        System.out.println("\nWas soll decodiert werden?");
        System.out.println("\tOption 1 - binary to String");
        int option = s.nextInt();
        System.out.println();


        switch (option) {
            case 1:
                readFile(option, fileName);
                break;

            default:
                System.out.println("Diese Option ist nicht vorhanden!");
        }
        s.close();
    }
}
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Decoder {

    public static String readFile(String fileName) {
        Path path1 = FileSystems.getDefault().getPath(fileName);
        String content = "";
        try {
            content = Files.readString(path1, StandardCharsets.ISO_8859_1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void shiftCipherDecoder(int shiftNumberStart, int shiftNumberEnd, String content) {
        String[] arr = content.split("");
        char letter = ' ';
        int letterValue = 0;
        int addition = 0;
        System.out.println("encrypted: \t" + content);
        System.out.println("shift starts at: " + shiftNumberStart);
        System.out.println("shift ends at: \t" + shiftNumberEnd);
        for (int k = shiftNumberStart; k <= shiftNumberEnd; k++) {
            addition = k;
            for (int i = 0; i < arr.length; i++) {
                letter = arr[i].charAt(0); // char at this array pos
                letterValue = (int) letter; // dec value of char
                letterValue = letterValue + addition; // increment value of char
                letter = (char) letterValue; // set new value to char
                arr[i] = String.valueOf(letter); // set new char to array pos

                if (i == 0) {
                    System.out.print(k + ": " + arr[i]);
                } else {
                    System.out.print(arr[i]);
                }
            }
            System.out.println();
        }
    }

    public static void fileToArray(String fileName) {
        try {
            ArrayList<String> allLinesRead = new ArrayList<>(Files.readAllLines(Paths.get(fileName)));
            System.out.println("Typ Array: " + allLinesRead);
            binaryToText(allLinesRead);
        } catch (IOException e) {
            System.out.println("An error occurred.");
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
                System.out.println("Typ ASCII: " + "This is not a letter!");
            } else {
                System.out.println("Typ ASCII: " + charakter);
            }
            System.out.println();
        }

    }

    // ---------------------------------------- MAIN
    // -----------------------------------------------
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nDecoder");
        System.out.println("\nChoose an option");
        System.out.println("\toption 1 - Shift sipher alias Caesar Cipher"); // work in progress
        System.out.println("\toption 2 - binary to String");
        int option1Main = s.nextInt();
        System.out.println();

        switch (option1Main) {
            case 1:
                System.out.println("Shift sipher alias Caesar Cipher");
                System.out.println("\toption 1 - file");
                System.out.println("\toption 2 - String");
                int option2Decrypter = s.nextInt();
                switch (option2Decrypter) {
                    case 1:
                        System.out.print("\nfilename: ");
                        String fileNameShift = s.next();
                        System.out.print("\n" + readFile(fileNameShift));
                        System.out.print("\nshift should start at: ");
                        int shiftNumberStart = s.nextInt();
                        System.out.print("\nshift should end at: ");
                        int shiftNumberEnd = s.nextInt();
                        System.out.println();
                        System.out.println("\nStart Decoding...");
                        shiftCipherDecoder(shiftNumberStart, shiftNumberEnd, readFile(fileNameShift));
                        System.out.println("...Finished Decoding");
                        break;
                    case 2:
                        System.out.print("\nString: ");
                        String stringShift = s.next();
                        System.out.print("\nshift should start at: ");
                        int shiftStringNumberStart = s.nextInt();
                        System.out.print("\nshift should end at: ");
                        int shiftStringNumberEnd = s.nextInt();
                        System.out.println();
                        System.out.println("\nStart Decoding...");
                        shiftCipherDecoder(shiftStringNumberStart, shiftStringNumberEnd, stringShift);
                        System.out.println("...Finished Decoding");
                        break;
                    default:
                        System.out.println("This option does not exist!");
                        break;
                }
                break;
            case 2:
                System.out.println("binary to String");
                System.out.println("\toption 1 - file");
                System.out.println("\toption 2 - String"); // work in progress
                int option3binary = s.nextInt();
                switch (option3binary) {
                    case 1:
                        System.out.print("\nfilename: ");
                        String fileNameBinary = s.next();
                        fileToArray(fileNameBinary);
                        break;
                    default:
                        System.out.println("...work on progress!...");
                        break;
                }
                break;
            default:
                System.out.println("This option does not exist!");
                break;
        }
        s.close();
    }
}
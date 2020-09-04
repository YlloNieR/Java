import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class MyDecoder {
    public static String byteToHex(byte b) {
        // Returns hex String representation of byte b
        char hexDigit[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        char[] array = { hexDigit[(b >> 4) & 0x0f], hexDigit[b & 0x0f] };
        return new String(array);
    }

    public static String charToHex(char c) {
        // Returns hex String representation of char c
        byte hi = (byte) (c >>> 8);
        byte lo = (byte) (c & 0xff);
        return byteToHex(hi) + byteToHex(lo);
    }

    public static void printBytes(byte[] array, String name) {
        for (int k = 0; k < array.length; k++) {
            System.out.println(name + "[" + k + "] = " + "0x" + MyDecoder.byteToHex(array[k]));
        }
    }

    public static void toHex(String original) {
        try {
            byte[] utf8Bytes = original.getBytes("UTF8");
            byte[] defaultBytes = original.getBytes();

            String roundTrip = new String(utf8Bytes, "UTF8");
            System.out.println("roundTrip = " + roundTrip);
            System.out.println();
            printBytes(utf8Bytes, "utf8Bytes");
            System.out.println();
            printBytes(defaultBytes, "defaultBytes");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }        
    }

    public static String readFile(String fileName) {
        String data = "";
        try {
            File myFile = new File(fileName);
            Scanner fileReader = new Scanner(myFile);

            while (fileReader.hasNextLine()) {
                data = fileReader.nextLine();
            }
            toText(data);
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ein Fehler ist aufgetreten!");
            e.printStackTrace();
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Was soll decodiert werden?");
        System.out.println("Option 1 - .bin Dateien");
        int option = s.nextInt();

        switch (option) {
            case 1:
                System.out.println("Geben Sie die Datei ein welche sich im selben Ordner befindet:\nBeispiel:asd.bin");
                String myFile = s.next();

                System.out.println(readFile(myFile));
                break;

            default:
                System.out.println("Diese Option ist nicht vorhanden!");
        }
        s.close();
    }
}
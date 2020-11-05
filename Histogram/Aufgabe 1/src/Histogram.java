public class Histogram {

    public static int numberOfArrays = 1;

    public static void propertiesOfArrays(double[] data) {
        System.out.print("\nWerte des " + numberOfArrays + ". Arrays: ");
        showArray(data);
        System.out.print("\nLaenge: " + data.length+"\n");
        System.out.println();
    }

    public static void showArray(double[] data) {
        numberOfArrays++;
        int i = 0;

        for (double valueArr : data) {
            i++;
            if (i < data.length) {
                System.out.print(valueArr + ", ");
            } else {
                System.out.print(valueArr);
            }
        }
    }
    
    public static void histogramVersion2(double[] data) {
        propertiesOfArrays(data);
        int biggestNumber = biggestNumber(data);
        String spacesWithoutNum = "      |";
        String spacesWithNum = "     ";
        String spacesWithNumSeperator = "|";
        int lengthArray = data.length+1;

        System.out.println("Wert  " + spacesWithNumSeperator);

        for (int i = biggestNumber; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.print(spacesWithNum + i + spacesWithNumSeperator);                                
            } else {
                System.out.print(spacesWithoutNum);
                
            }
            inputX(data, i);
            System.out.print("\n");
        }
        System.out.print("      ");
        for (int i = 0; i < lengthArray; i++) {
            if (i == 0) {
                System.out.print("+");
                i++;
            }            
            if (i % 2 != 0) {
                System.out.print(i);
            } else {
                System.out.print("-");
            }
            if (i + 1 == lengthArray) {
                System.out.print("\n");
            }
        }
        System.out.println(spacesWithNum + spacesWithNum + "Punkt");
    }

    public static void histogramVersion1(double[] data) {
        propertiesOfArrays(data);
        int biggestNumber = biggestNumber(data);
        String spacesWithoutNum = "      |";
        String spacesWithNum = "     ";
        String spacesWithNumSeperator = "|";
        int lengthArray = data.length;

        System.out.println("Wert " + (biggestNumber + 1) + spacesWithNumSeperator);

        for (int i = biggestNumber; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.print(spacesWithNum + i + spacesWithNumSeperator);                                
            } else {
                System.out.print(spacesWithoutNum);
                
            }
            inputX(data, i);
            System.out.print("\n");
        }
        System.out.print("      ");
        for (int i = 0; i < lengthArray; i++) {
            if (i == 0) {
                System.out.print("+");
                i++;
            }            
            if (i % 3 == 0) {
                System.out.print(i);
            } else {
                System.out.print("-");
            }
            if (i + 1 == lengthArray) {
                System.out.print("\n");
            }
        }
        System.out.println(spacesWithNum + spacesWithNum + spacesWithNum + "Punkt");
    }

    public static void inputX(double[] data, int i) {
        int tmp1 = i;
        int tmp2 = 0;

        for (int j = 0; j < data.length; j++) {
            tmp2 = roundNumber(data[j]);
            if (tmp1 == tmp2) {
                System.out.print("x");
                data[j]--;
            } else {
                System.out.print(" ");
            }
        }
    }

    public static int biggestNumber(double[] data) {
        double tmp = 0;
        for (double valueArr : data) {
            if (tmp < valueArr) {
                tmp = valueArr;
            }
        }
        return (int) Math.round(tmp);
    }

    public static int roundNumber(double dbNum) {
        dbNum = Math.round(dbNum - 0.1);
        return (int) dbNum;
    }

    public static void main(String[] args) {
        double[] data1 = { 1.1, 1.9, 2.2, 3.0, 5.1, 5.2, 4.3, 0.1, 4.5, 0.1, 4.5, 5.1 };
        double[] data2 = { 8.0, 6.0, 4.0, 1.0, 2.0, 3.0, 4.0, 9.0 };

        histogramVersion1(data1);
        histogramVersion2(data2);
    }
}

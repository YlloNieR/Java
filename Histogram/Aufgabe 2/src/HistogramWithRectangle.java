public class HistogramWithRectangle {

    public static int numberOfArrays = 1;

    // 7 first letters and spaces
    // 3 rows down
    // public static char[][] charArr = new char[7+11][3+10];
    public static char[][] charArr = new char[5][7];    
    public static int charArrLengthXColumn = charArr[0].length;
    public static int charArrLengthYRow = charArr.length;
    public static int rowCount = 0;


    public static void propertiesOfArrays(double[] data) {
        System.out.print("\nWerte des " + numberOfArrays + ". Arrays: ");
        showArray(data);
        System.out.print("\nLaenge: " + data.length + "\n");
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
        int j;
        int x = 0;
        int y = rowCount;

        for (j = 0; j < data.length; j++) {
            tmp2 = roundNumber(data[j]);
            if (tmp1 == tmp2) {
                System.out.print("x");
                if(x < charArrLengthXColumn){
                    inputChar(x, y, 'x');
                    x++;
                }                    
                data[j]--;
            } else {
                System.out.print(" ");
                if(x < charArrLengthXColumn){
                    inputChar(x, y, ' ');
                    x++;
                }
            }
        }
        if(rowCount<charArrLengthXColumn){
            rowCount++;
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

    public static void inputChar(int x, int y, char c) {
        charArr[y][x] = c;
    }

    public static void showCharArray() {
        
        System.out.println("number of columns: " + (charArrLengthXColumn + 1));
        System.out.println("number of rows: " + (charArrLengthYRow + 1));

        for (int y = 0; y < charArrLengthYRow; y++) {
            for (int x = 0; x < charArrLengthXColumn; x++) {
                System.out.print(charArr[y][x]);
            }
            System.out.print("\n");
        }

    }

    public static void checkCellsForX() {
        int charArrLengthXColumn = charArr[0].length;
        int charArrLengthYRow = charArr.length;
        boolean fristRule = false;
        boolean secondRule = false;

        for (int y = 0; y < charArrLengthYRow - 1; y++) {
            for (int x = 0; x < charArrLengthXColumn - 1; x++) {
                if ((charArr[y][x] == charArr[y][x + 1]) && charArr[y][x] == 'x') {
                    charArr[y][x] = 'o';
                    charArr[y][x + 1] = 'o';
                }
            }
        }

        /*
         * for (int y = 0; y < charArrLengthYRow-1; y++) { for (int x = 0; x <
         * charArrLengthXColumn-1; x++){ if(charArr[y][x] == charArr[y][x+1]){
         * if(charArr[y+1][x] == charArr[y+1][x+1]){ charArr[y][x] = 'o';
         * charArr[y][x+1] = 'o'; charArr[y+1][x] = 'o'; charArr[y+1][x+1] = 'o'; } } }
         * }
         */
    }

    public static void main(String[] args) {
        double[] data1 = { 1.1, 1.9, 2.2, 3.0, 5.1, 5.2, 4.3, 0.1, 4.5, 0.1, 4.5, 5.1 };

        histogramVersion1(data1);

        //checkCellsForX();

        showCharArray();
    }
}

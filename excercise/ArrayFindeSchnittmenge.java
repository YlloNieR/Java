public class ArrayFindeSchnittmenge {   

    public static void showArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            if(i < (arr.length-1)){
                System.out.print(arr[i]+", ");
            }
            else{
                System.out.print(arr[i]);
            }
            
        }        
    }

    public static void schnittmenge(int arrA[],int arrB[]){
        int[] biggest = {};
        int[] smallest = {};
        int l = 0;
        if(arrA.length > arrB.length){
            biggest = arrA;
            smallest = arrB;
        }
        else{
            biggest = arrB;
            smallest = arrA;
        }
        int[] schnittmenge = new int[biggest.length];

        for(int j = 0; j< biggest.length;j++){
            for (int k = 0; k < smallest.length;k++){
                if(smallest[k] == biggest[j]){                    
                    schnittmenge[l] = biggest[j];
                    l++;
                }
            }
        }

        showArray(schnittmenge);
    }

    public static void main(String[] args){
        int[] arrA = {1,2,3,5,6,7};
        int[] arrB = {5,3,9,8,67,12,2};

        
        System.out.println("Array A: ");
        showArray(arrA);
        System.out.println("\nArray B: ");
        showArray(arrB);
        System.out.println("\nSchnittmenge: ");
        schnittmenge(arrA,arrB);
    }
}

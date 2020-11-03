public class ermittleQuartalsUmsatz {
    public static void main(String[] args){
        double[] umsaetzeArray = {2000.00,1000.00,4000.00,5000.00};
        umsaetze(umsaetzeArray);
    }
    public static void umsaetze(double[] umsaetzeArray){
        double umsatzQuartal = 0;
        for (int i = 0; i < umsaetzeArray.length; i++){
            umsatzQuartal = umsatzQuartal + umsaetzeArray[i];
        }
        String s = String.format("%.2f", umsatzQuartal);
        System.out.println(s);
   
    }
}
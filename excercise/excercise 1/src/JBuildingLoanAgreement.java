public class JBuildingLoanAgreement{

    public static String commaAfter2Digits(double money){
        String str = String.format("%.2f", money);        
        return str;
    }

    public static void main(String[] args){
        int termYears = 5;
        double interest = 3.5;
        int termMonths = termYears * 12;
        int monthlyRate = 300;
        double accountBalance = 300;

        for(int i = 1; i < termMonths+1; i++){
            System.out.println(i+". month, account balance: "+commaAfter2Digits(accountBalance)+" Euro");
            if(i % 12 == 0){
                accountBalance = accountBalance + ((accountBalance/100)*interest);
                System.out.println("\n"+(i/12)+". year, account balance: "+commaAfter2Digits(accountBalance)+" Euro\n");
            }
            accountBalance = accountBalance + monthlyRate;
           
        }
    }
}
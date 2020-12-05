public class KBuildingLoanAgreement2{

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
        int counter = 0 ;

        while(counter != termMonths){
            counter++;
            System.out.println(counter+". month, account balance: "+commaAfter2Digits(accountBalance)+" Euro");
            if(counter % 12 == 0){
                accountBalance = accountBalance + ((accountBalance/100)*interest);
                System.out.println("\n"+(counter/12)+". year , account balance: "+commaAfter2Digits(accountBalance)+" Euro\n");
            }
            accountBalance = accountBalance + monthlyRate;
                       
        }
    }
}
public class Bausparkonto2 {
    public static void main(String[] args){     
        
        double Betrag = 0;
        int t = 1;          
        while(t!=61){
			Betrag += 300;
			
			if(t % 12 == 0 && t > 0){
				Betrag *= 1.035;				
			}
			
			String StringBetrag = String.format("%.2f",Betrag);
			System.out.println("Im "+t+". Monat ist es = "+StringBetrag+" EURO");			            
			t++;
        }
    }    
}
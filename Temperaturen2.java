public class Temperaturen2 {
	public static void main(String[] args) {
		double[] temperaturen =  {0.6,3.9, 6.6, 9.6, 10.9, 19.8, 18.9, 19, 14.1, 15.1, 10.7, 5.3, 3.8};
		String[] monate = {"Januar","Februar","Maerz","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember"};
		double[] maxTemperatur = hoechsteTemperatur(temperaturen);
		double[] minTemperatur = niedrigsteTemperatur(temperaturen);
		double durchschnitt = durchschnittBerechnen(temperaturen);
		System.out.println("Die hoechste Temperatur war: "+maxTemperatur[0]+" C im Monat "+monate[(int)maxTemperatur[1]]+"\nDie niedrigste Temperatur war: "+minTemperatur[0]+" C im Monat "+monate[(int)minTemperatur[1]]+" \nDie Durchschnittstemperatur war: "+durchschnitt+" C");
	
	}
	
	public static double[] hoechsteTemperatur(double[] temp){
		double max = temp[0];
		int position = 0;
		for(int i = 0; i<temp.length;i++) {
			if(temp[i]>max){
				max = temp[i];
				position = i;
			}
		}
		double[] maxMitPos = {max,position};
		return maxMitPos;
	}
	
	public static double[] niedrigsteTemperatur(double[] temp){
		double min = temp[0];
		int position = 0;
		for(int i = 0; i<temp.length;i++) {
			if(temp[i]<min){
				min = temp[i];
				position = i;
			}
		}
		double[] minMitPos = {min,position};
		return minMitPos;
	}
	
	public static double durchschnittBerechnen(double[] temp){
		double durchschnitt = 0;
		for(int i = 0; i< temp.length;i++){
			durchschnitt += temp[i];
		}
		durchschnitt /= temp.length;
		return durchschnitt;
	}
}
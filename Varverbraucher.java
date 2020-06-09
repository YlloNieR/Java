public class Varverbraucher{
    public static void main (String Args []){
    
    double Oel = 0.5;
    int Oelkm = 1000;
    double preis1 = 1.207;
    double Sprit = 6.8;
    int Spritkm = 100;
    double preis2 = 7.494 / 5 ;
    
    double kmsprit1 = Sprit / 100*0.5; //6,8 / 100*0,5 = 0,034
    String Stringkmsprit1 = String.format("%.6f",kmsprit1);
    double kmsprit2 = Sprit / 100*5; //6,8 / 100*5 = 0,34
    String Stringkmsprit2 = String.format("%.6f",kmsprit2);
    double kmsprit3 = Sprit / 100*314.15; //6,8 / 100*314,15 = ‭21,3622‬
    String Stringkmsprit3 = String.format("%.6f",kmsprit3);
    
    
    double spritpreis1 = kmsprit1*preis1; //(6,8 / 100*0,5)*1,207 = 0,041038
    double spritpreis2 = kmsprit2*preis1; //(6,8 / 100*5)*1,207 = 0,4953
    double spritpreis3 = kmsprit3*preis1; //(6,8 / 100*314,15)*1,207 = 25,7841
    
    double kmoel1 = Oel / 1000*0.5; //0,5 / 1000*0,5 = 0,00025
    String Stringkmoel1 = String.format("%.6f",kmoel1);
    double kmoel2 = Oel / 1000*5; //0,5 / 1000*5 = 0,0025
    String Stringkmoel2 = String.format("%.6f",kmoel2);
    double kmoel3 = Oel / 1000*314.15; //0,5 / 1000*314,15 = 0,157075
    String Stringkmoel3 = String.format("%.6f",kmoel3);
    
    double oelpreis1 = kmoel1*preis2; //(0,5 / 1000*0,5) * (7,494/5) = ‭0,0003747‬
    String Stringoelpreis1 = String.format("%.6f",oelpreis1);
    double oelpreis2 = kmoel2*preis2; //(0,5 / 1000*5) * (7,494/0,5) = ‭0,03747‬
    String Stringoelpreis2 = String.format("%.6f",oelpreis2);
    double oelpreis3 = kmoel3*preis2; //(0,5 / 1000*314,15) * (7,494/5) = ‭0,23542401‬
    String Stringoelpreis3 = String.format("%.6f",oelpreis3);
    
    
    System.out.println ("\nkorrekt");
    System.out.println (kmsprit1 +" "+"Liter Benzin" +" "+"kostet" +" "+ spritpreis1 +"\n "+ kmoel1 +" "+"Liter Oel" +" "+ "kostet" +" "+ oelpreis1 );
    System.out.println ("gerundet kmsprit1 = "+Stringkmsprit1);
    System.out.println ("gerundet kmoel1 = "+Stringkmoel1);
    System.out.println ("gerundet oelpreis1 = "+Stringoelpreis1);
    System.out.println ("\nkorrekt");
    System.out.println (kmsprit2 +" "+"Liter Benzin" +" "+"kostet" +" "+ spritpreis2 +"\n "+ kmoel2 +" "+"Liter Oel" +" "+ "kostet" +" "+ oelpreis2 );
    System.out.println ("gerundet kmsprit2 = "+Stringkmsprit2);
    System.out.println ("gerundet kmoel2 = "+Stringkmoel2);
    System.out.println ("gerundet oelpreis2 = "+Stringoelpreis2); System.out.println ("\nkorrekt");
    System.out.println (kmsprit3 +" "+"Liter Benzin" +" "+"kostet" +" "+ spritpreis3 +"\n "+ kmoel3 +" "+"Liter Oel" +" "+ "kostet" +" "+ oelpreis3 );
    System.out.println ("gerundet kmsprit3 = "+Stringkmsprit3);
    System.out.println ("gerundet kmoel3 = "+Stringkmoel3);
    System.out.println ("gerundet oelpreis3 = "+Stringoelpreis3);
    }
    }
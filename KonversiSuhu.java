import java.util.Scanner;

public class KonversiSuhu {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int celcius, fahrenheit, reamur, kelvin;
       System.out.print("Masukkan suhu derajat celcius : ");
       celcius = input.nextInt();
       fahrenheit = celcius*9/5+32;
       reamur = celcius*4/5;
       kelvin = celcius+273;

       System.out.println("Hasil dari celcius ke fahrenheit adalah = "+fahrenheit+"°F");
       System.out.println("Hasil dari celcius ke reamur adalah = "+reamur+"°R");
       System.out.println("Hasil dari celcius ke kelvin adalah = "+kelvin+"°K");
   } 
}

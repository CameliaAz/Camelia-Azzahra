import java.util.Scanner;

/**
 * main
 */
public class main {
public static void hitung(int a, int b)
{
System.out.println("Hasil:"+(a+b));
}
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      System.out.print("Masukkan bilangan 1 : ");
      int bill1 = input.nextInt();
      
      System.out.print("Masukkan bilangan 2 : ");
      int bill2 = input.nextInt();

      hitung(bill1, bill2);
    }
}
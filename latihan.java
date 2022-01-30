import java.util.Scanner;

public class latihan {   
Scanner input = new Scanner(System.in);
 public static void main(String[] args) {
     System.out.println("=======================\n"+"=== STRUK INDOMARET ===\n"+"=======================");
   Scanner input = new Scanner(System.in);
   System.out.print("Masukkan Harga Barang : ");
   int harga = input.nextInt();
   
   System.out.print("Masukkan Jumlah Barang : ");
   int jumlah = input.nextInt();
   int total = harga * jumlah;
   System.out.println("Total Belanja : " +total);

   System.out.println("Masukkan Jumlah Bayar");
   int bayar = input.nextInt();
   int kembali = bayar-total;
   System.out.println("Total Kembalian : "+kembali);

   System.out.println("=======================");
   System.out.println("=======================");

 }   
}

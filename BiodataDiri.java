import java.util.Scanner;

public class BiodataDiri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama, tempat_lahir, jenis_kelamin, alamat_malang, motto_hidup;
        int nis, tanggal_lahir;

        System.out.print("Masukkan Nama = ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamatmu di Malang = ");
        alamat_malang = input.nextLine();
        System.out.print("Masukkan nomor NIS = ");
        nis = input.nextInt();
        System.out.print("Masukkan Tempat Lahir = ");
        tempat_lahir = input.next();
        System.out.print("Masukkan Tanggal Lahir = ");
        tanggal_lahir = input.nextInt();
        System.out.print("Masukkan Jenis Kelamin = ");
        jenis_kelamin = input.next();
        System.out.print("Masukkan Motto Hidupmu = ");
        motto_hidup= input.next();
        

        System.out.println("===========================\n"+"==== BIODATA DIRI ANDA ====\n"+"===========================\t");
        System.out.println("Nama = " +nama);
        System.out.println("NIS  = " +nis);
        System.out.println("Tempat Lahir  = " +tempat_lahir);
        System.out.println("Tanggal Lahir = " +tanggal_lahir);
        System.out.println("Jenis Kelamin = " +jenis_kelamin);
        System.out.println("Alamat di Malang = " +alamat_malang);
        System.out.println("Motto Hidup = " +motto_hidup);
        System.out.println("===========================");
        System.out.println("===========================");
    }
}

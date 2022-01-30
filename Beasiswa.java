import java.util.Scanner;

public class Beasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai TPA : ");
        int TPA = input.nextInt();
        System.out.print("Masukkan Nilai Bahasa Inggris : ");
        int BahasaInggris = input.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80)){
            System.out.println("Siswa Dapat Beasiswa");
        }
        else{
            System.out.println("Siswa Tidak Dapat Beasiswa");
        }
    }
}

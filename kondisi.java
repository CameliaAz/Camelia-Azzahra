import java.util.Scanner;

public class kondisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan nilai akhir PBO");
        nilai = input.nextInt();
        if (nilai < 70) {
            System.out.println("Siswa Tidak Lulus");
        }
        if (nilai > 70) {
            System.out.println("SIswa Lulus");
        }
    }
}

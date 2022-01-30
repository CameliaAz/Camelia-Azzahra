import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan batas bilangan : ");
        int batas = input.nextInt();
        int hasil =0;
        for(int a=1; a<=batas; a++)
        hasil +=3; {
            System.out.println("Total Jumlahnya Adalah ="+hasil);
        }
    }
}

import java.util.Scanner;

public class MenghitungLuasPermukaanBola {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double r, phi, luas;

        System.out.print("Masukkan nilai R : ");
        r = input.nextDouble();
        System.out.print("Masukkan phi : ");
        phi = input.nextDouble();
        luas = 4*phi*r*r;
        System.out.print("Luas permukaan bola adalah :"+luas);
    }
}

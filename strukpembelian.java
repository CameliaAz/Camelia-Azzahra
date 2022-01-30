import java.util.Scanner;

public class strukpembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama_petugas, tanggal;
        int a, b, total_semua; 

        String kode_barang[]=new String[5];
        String nama_barang[]=new String[5];
        int jumlah_barang[]=new int[5];
        int harga_barang[]=new int[5];
        int total_harga[]=new int[5];

        System.out.println("===========================\n"+"===== STRUK INDOMARET =====\n"+"===========================");
        System.out.print("nama petugas : ");
        nama_petugas=input.nextLine();
        System.out.print("tanggal : ");
        tanggal=input.next();
        System.out.println("\n");
        System.out.print("jumlah data yang akan di masukkan : ");
        b=input.nextInt();
 
        for (a=1; b<=a; a++){
            int number =a;
            System.out.println("data ke-"+number+"\n");
            System.out.println("nama barang : ");
            nama_barang[a]=input.next();
            System.out.println("jumlah barang \t : ");
            jumlah_barang[a]=input.nextInt();
            
            if (nama_barang[a].equals("Potato")) {
                harga_barang[a]=75000;
                kode_barang[a]="B001";
            }
            else if(nama_barang[a].equals("Teh Pucuk")){
               harga_barang[a]=5000;
               kode_barang[a]="A001"; 
            }
            else if(nama_barang[a].equals("Sabun Cuci")){
               harga_barang[a]=10000;
               kode_barang[a]="C0001";
            }
            else{
                kode_barang[a]="-";
                harga_barang[a]=0;
            }
            total_harga[a]=harga_barang[a]*jumlah_barang[a];
            System.out.println("==========================================================================\t");
        }
        System.out.println("=========================================================================================\t");
        System.out.println("====================================== STRUK INDOMARET ==================================\t");
        System.out.println("=========================================================================================\t");
        System.out.println("Nama petugas :"+nama_petugas+"\t\t"+"tanggal : "+tanggal);
        System.out.println("Jumlah Data  :"+a);

        System.out.println("=========================================================================================\t");
        System.out.println("Data ke-\tKode barang\tNama Barang\tHarga Barang\tJumlah Barang\tTotal Harga");
        System.out.println("=========================================================================================\t");

        for(a=0; a<b; a++){
            int number =a+1;
            System.out.println(+number+"\t\t"+kode_barang[a]+"\t\t"+nama_barang[a]+"\t\t"+harga_barang[a]+"\t\t"+jumlah_barang[a]+"\t\t"+total_harga[a]+"\t\t");
        }
    }
}

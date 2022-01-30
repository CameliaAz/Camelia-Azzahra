public class pbo {

    public static void main(String[] args) {
     System.out.println("DATA COVID PER JANUARI 2022"); 
     System.out.println("____________________________");
     keterangan_positif();
     System.out.println("sekitar " + jumlah()+ " orang");
     keterangan_negatif();
     System.out.println("sekitar " +jumlah1()+ " orang");
     keterangan(); 
     System.out.println(keterangan1()+ " data");
     System.out.println("____________________________");
     System.out.println("TERIMAKASIH");
     System.out.println("TETAP PATUHI PROTOKOL KESEHATAN YA");  
    }
    static void keterangan_positif(){
        System.out.println("Data orang yang terkena covid di indonesia : ");
    }
    static int jumlah(){
        int hasil = 500;
        return hasil;
    }
    static void keterangan_negatif(){
        System.out.println("Data orang yang sudah negatif di indonesia : ");
    }
    static int jumlah1(){
     int hasil = 1000;
     return hasil;  
    }
    static void keterangan(){
        System.out.println("Data orang yang ter-suspek covid : ");
    }
    static String keterangan1(){
    String keterangan2 = "tidak ada";
    return keterangan2;
    }
}

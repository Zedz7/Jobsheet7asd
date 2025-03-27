import java.util.Scanner;
public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;
        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06(5);

        for(int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke -" + (i + 1));
            System.out.print("NIM       :");
            String nim = sc.nextLine();
            System.out.print("Nama      : ");
            String nama = sc.nextLine();
            System.out.print("Kelas     : ");
            String kelas = sc.nextLine();
            System.out.print("IPK       : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("---------------------------");
            Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }
        list.tampil();
        //Melakukan pencarian data sequential
        System.out.println("-----------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble(); 

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }   
}
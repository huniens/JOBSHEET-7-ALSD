import java.util.Scanner;

/**
 * MahasiswaMain
 */
public class MahasiswaMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        System.out.println("Masukkan jumlah Mahasiswa : ");
        int jumMhs = s.nextInt();

        
        System.out.println("---------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari NIM terkecil");
        for(int i = 0; i < jumMhs; i++) {
            System.out.println("---------------------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = sl.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("-------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("__________________________________________________________");
        System.out.println("__________________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan nama mahasiswa yang dicari : ");
        System.out.print("Nama : ");
        String cariNama = sl.nextLine();
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindBinarySearchByNama(cariNama, 0, jumMhs - 1);

        if (posisi != -1) {
            System.out.println("Data " + cariNama + "ditemukan pada indeks " + posisi);
            System.out.println("Berikut data mahasiswa dengan nama yang sama: ");
            data.TampilDataByNama(cariNama);
        } else {
            System.out.println("Data " + cariNama + "tidak ditemukan");
        }
    }
}
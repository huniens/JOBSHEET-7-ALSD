/**
 * PencarianMhs
 */
public class PencarianMhs {

    Mahasiswa listMHs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listMHs.length) {
            listMHs[idx] = m;
            idx  ++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil() {
        for(Mahasiswa m: listMHs) {
            m.tampil();
            System.out.println("----------------------------");
    }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMHs.length; j++) {
            if (listMHs[j].nim==cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos)
    {
        if (pos!= -1) {
            System.out.println("data : "+ x + "ditemukan pada indeks " + pos);

        } else {
            System.out.println("data "+ x + "tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos)
    {
        if (pos!= -1) {
            System.out.println("Nim\t : " + x );
            System.out.println("Nama\t : "+listMHs[pos].nama);
            System.out.println("Umur\t : "+listMHs[pos].umur);
            System.out.println("IPK\t : "+listMHs[pos].ipk);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
}
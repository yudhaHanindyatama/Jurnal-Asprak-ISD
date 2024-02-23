import java.util.Scanner;

public class Data {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        LinkedList<Pegawai> data = new LinkedList<>();

        int pilihan;

        do {
            Pegawai pegawai = null;
            System.out.println("Pilihlah menu :\n 1. Input data\n 2. Hapus Data\n 3. Cetak List Pegawai\n 4. Keluar");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data\nTuliskan nip, nama dan divisi pegawai");
                    int nip = input.nextInt();
                    String nama = input.next();
                    String divisi = input.next();
                    pegawai = new Pegawai(nip, nama, divisi);
                    System.out.println("Tambahkan data diawal list? (y/n)");
                    String pilih = input.next();
                    if (pilih.equals("y")) {    
                        data.tambahDepan(pegawai);
                    } else {
                        data.tambahBelakang(pegawai);
                    }
                    break;
                case 2:
                    System.out.println("Hapus data dari depan? (y/n)");
                    String hapusData = input.next();
                    if (hapusData.equals("y")) {
                        data.hapusDepan(pegawai);
                    } else {
                        data.hapusBelakang(pegawai);
                    }
                    break;
                case 3:
                    data.traverse();
                    break;
                case 4:
                    return;
                }
        } while (true);
    }

    
}

import java.util.Scanner;

public class DosenDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int n = sc.nextInt();
        sc.nextLine();

        Dosen07[] arrayOfDosen = new Dosen07[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode  : ");
            String kode = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true=Pria, false=Wanita): ");
            boolean jk = sc.nextBoolean();
            System.out.print("Usia  : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen07(kode, nama, jk, usia);
            System.out.println("-------------------------");
        }

        DataDosen07 data = new DataDosen07();
        data.dataSemuaDosen(arrayOfDosen);
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        data.infoDosenPalingTua(arrayOfDosen);
        data.infoDosenPalingMuda(arrayOfDosen);
    }
}
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

        for (Dosen07 d : arrayOfDosen) {
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("-------------------------");
        }
    }
}
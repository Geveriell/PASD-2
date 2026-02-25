public class DataDosen07 {

    public void dataSemuaDosen(Dosen07[] arrayOfDosen) {
        for (Dosen07 d : arrayOfDosen) {
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("-------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen07[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen07 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("-------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen07[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen07 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }

        if (jmlPria > 0) {
            System.out.println("Rata-rata Usia Dosen Pria   : " + (totalPria / jmlPria));
        }
        if (jmlWanita > 0) {
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / jmlWanita));
        }
        System.out.println("-------------------------");
    }

    public void infoDosenPalingTua(Dosen07[] arrayOfDosen) {
        Dosen07 tertua = arrayOfDosen[0];

        for (Dosen07 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua");
        System.out.println("Kode          : " + tertua.kode);
        System.out.println("Nama          : " + tertua.nama);
        System.out.println("Jenis Kelamin : " + (tertua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + tertua.usia);
        System.out.println("-------------------------");
    }

    public void infoDosenPalingMuda(Dosen07[] arrayOfDosen) {
        Dosen07 termuda = arrayOfDosen[0];

        for (Dosen07 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda");
        System.out.println("Kode          : " + termuda.kode);
        System.out.println("Nama          : " + termuda.nama);
        System.out.println("Jenis Kelamin : " + (termuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + termuda.usia);
        System.out.println("-------------------------");
    }
}
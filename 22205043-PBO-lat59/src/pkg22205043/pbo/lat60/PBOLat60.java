package pkg22205043.pbo.lat60;

import java.util.Scanner;

class Akatsuki {

    protected String nama;
    protected String asal;
    protected String posisiCincin;
    protected String ciriKhas;    

    public Akatsuki(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getPosisiCincin() {
        return posisiCincin;
    }

    public void setPosisiCincin(String posisiCincin) {
        this.posisiCincin = posisiCincin;
    }

    public String getCiriKhas() {
        return ciriKhas;
    }

    public void setCiriKhas(String ciriKhas) {
        this.ciriKhas = ciriKhas;
    }

    public void tugas() {
        System.out.println("Tugas\t\t: Mengumpulkan 9 bijuu dan menguasai dunia");
    }

    public void tampilNama() {
        System.out.println("========== " + nama + " ==========");
        System.out.println("Nama \t\t: " + nama);
    }
}

class Pemimpin extends Akatsuki {

    public Pemimpin(String nama) {
        super(nama);
    }

    @Override
    public void tugas() {
        super.tugas();
        System.out.println("\t\t Memimpin Klan akatsuki");
    }
}

class Anggota extends Akatsuki {

    public Anggota(String nama) {
        super(nama);
    }

}

public class PBOLat60 {

    public static void main(String[] args) {
        //        Deklarasi & Instasiasi
        int i, pilihan;
        char lagi;
        String[] listNama = {"Pain", "Obito Uchiha", "Itachi Uchiha", "Sasori", "Orochimaru", "Kakuzu", "Hidan", "Deidara",
            "Konan", "Kisame Hoshigaki", "Zetsu"};
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

        do {
//        List Perulangan -> Daftar Anggota
            System.out.println("===Daftar Anggota Akatsuki===");
            for (i = 0; i < listNama.length; i++) {
                System.out.println(i + 1 + ". " + listNama[i]);
            }

//        Pilih Nomor pilihan
            System.out.print("\nMasukkan Pilihan Anda (1-" + i + "): ");
            pilihan = scn1.nextInt();

//        Proses pilihan
            switch (pilihan) {
                case 1 -> {
                    Pemimpin pain = new Pemimpin("Pain/Nagato");
                    pain.setAsal("Amegakure");
                    pain.setPosisiCincin("Jempol Kanan");
                    pain.setCiriKhas("Rambut berwarna Oren dan lancip, memiliki seperti tindikan di hidung, ");

                    pain.tampilNama();
                    System.out.println("Asal \t\t: " + pain.getAsal());
                    System.out.println("Posisi cincin\t: " + pain.getPosisiCincin());
                    System.out.println("Ciri khas\t: " + pain.getCiriKhas());
                    pain.tugas();
                }
                case 2 -> {
                    Pemimpin tobi = new Pemimpin("Tobi/Obito Uchiha");
                    tobi.setAsal("Kohonagakure");
                    tobi.setPosisiCincin("Jempol kiri");
                    tobi.setCiriKhas("Topeng jingga dengan satu lubang mata seperti pusaran yang terpusat pada mata kanan");

                    tobi.tampilNama();
                    System.out.println("Asal \t\t: " + tobi.getAsal());
                    System.out.println("Posisi cincin\t: " + tobi.getPosisiCincin());
                    System.out.println("Ciri khas\t: " + tobi.getCiriKhas());
                    tobi.tugas();
                }
                case 3 -> {
                    Anggota itachi = new Anggota("Itachi Uchiha");
                    itachi.setAsal("Konohagakure");
                    itachi.setPosisiCincin("Jari manis kanan");
                    itachi.setCiriKhas("Berambut belah tengah, ahli dalam Genjutsu, memakai sharingan");

                    itachi.tampilNama();
                    System.out.println("Asal \t\t: " + itachi.getAsal());
                    System.out.println("Posisi cincin\t: " + itachi.getPosisiCincin());
                    System.out.println("Ciri khas\t: " + itachi.getCiriKhas());
                    itachi.tugas();
                }
                case 4 -> {
                    Anggota sasori = new Anggota("Sasori");

                    sasori.setAsal("Sunagakure");
                    sasori.setPosisiCincin("Jempol kiri");
                    sasori.setCiriKhas("Berambut pendek berwarna merah, Bertubuh boneka");

                    sasori.tampilNama();
                    System.out.println("Asal \t\t: " + sasori.getAsal());
                    System.out.println("Posisi cincin\t: " + sasori.getPosisiCincin());
                    System.out.println("Ciri khas\t: " + sasori.getCiriKhas());
                    sasori.tugas();
                }
                case 5 -> {
                    Anggota orochimaru = new Anggota("Orochimaru");
                    orochimaru.setAsal("Konohagakure/Otogakure");
                    orochimaru.setPosisiCincin("Telunjuk Kelingking kiri");
                    orochimaru.setCiriKhas("Berambut panjang berwarna hitam, berkulit pucat");

                    orochimaru.tampilNama();
                    System.out.println("Asal \t\t: " + orochimaru.getAsal());
                    System.out.println("Posisi cincin\t: " + orochimaru.getPosisiCincin());
                    System.out.println("Ciri khas\t: " + orochimaru.getCiriKhas());
                    orochimaru.tugas();
                }
                case 6 -> {
                    Anggota kakuzu = new Anggota("Kakuzu");
                    kakuzu.setAsal("Takigakure");
                    kakuzu.setPosisiCincin("Jari tengah kiri");
                    kakuzu.setCiriKhas("Memakai penutup wajah, memiliki lima jantung manusia secara bersamaan.");

                    kakuzu.tampilNama();
                    System.out.println("Asal \t\t: " + kakuzu.getAsal());
                    System.out.println("Posisi cincin\t: " + kakuzu.getPosisiCincin());
                    System.out.println("Ciri khas\t: " + kakuzu.getCiriKhas());
                    kakuzu.tugas();
                }
                case 7 -> {
                    Anggota hidan = new Anggota("Hidan");
                    hidan.setAsal("Yugakure");
                    hidan.setPosisiCincin("Telunjuk Kiri");
                    hidan.setCiriKhas("Tidak bisa mati,membawa sabit besar bermata tiga, rambut berwarna putih");

                    hidan.tampilNama();
                    System.out.println("Asal \t\t: " + hidan.getAsal());
                    System.out.println("Posisi cincin\t: " + hidan.getPosisiCincin());
                    System.out.println("Ciri khas\t: " + hidan.getCiriKhas());
                    hidan.tugas();
                }
                case 8 -> {
                    Anggota deidara = new Anggota("Deidara");
                    deidara.setAsal("Iwagakure");
                    deidara.setPosisiCincin("Telunjuk Kanan");
                    deidara.setCiriKhas("Rambut pirang dan dikuncir berwarna kuning, mulut di telapak tangan dan dada");

                    deidara.tampilNama();
                    System.out.println("Asal \t\t: " + deidara.getAsal());
                    System.out.println("Posisi cincin\t: " + deidara.getPosisiCincin());
                    System.out.println("Ciri khas\t: " + deidara.getCiriKhas());
                    deidara.tugas();
                }
                case 9 -> {
                    Anggota konan = new Anggota("Konan");
                    konan.setAsal("Amegakure");
                    konan.setPosisiCincin("Jari tengah, Tangan kanan");
                    konan.setCiriKhas("Memiliki origami bunga di kepala, berambut biru");

                    konan.tampilNama();
                    System.out.println("Asal \t\t: " + konan.getAsal());
                    System.out.println("Posisi cincin\t: " + konan.getPosisiCincin());
                    System.out.println("Ciri khas\t: " + konan.getCiriKhas());
                    konan.tugas();                                        
                }
                case 10 -> {
                    Anggota kisame = new Anggota("Kisame Hoshigaki");
                    kisame.setAsal("Kirigakure");
                    kisame.setPosisiCincin("Jari manis kiri");
                    kisame.setCiriKhas("Memiliki kulit seperti ikan hiu, bergigi seperti ikan hiu");

                    kisame.tampilNama();
                    System.out.println("Asal \t\t: " + kisame.getAsal());
                    System.out.println("Posisi cincin\t: " + kisame.getPosisiCincin());
                    System.out.println("Ciri khas\t: " + kisame.getCiriKhas());
                    kisame.tugas();
                }
                case 11 -> {
                    Anggota zetsu = new Anggota("Zetsu");
                    zetsu.setAsal("Tidak ada");
                    zetsu.setPosisiCincin("Kelingking kanan");
                    zetsu.setCiriKhas("Berwajah hitam dan putih, mempunyai dua kepribadian,memiliki kerudung kepala seperti tumbuhan venus");

                    zetsu.tampilNama();
                    System.out.println("Asal \t\t: " + zetsu.getAsal());
                    System.out.println("Posisi cincin\t: " + zetsu.getPosisiCincin());
                    System.out.println("Ciri khas\t: " + zetsu.getCiriKhas());
                    zetsu.tugas();
                }

                default ->
                    System.out.println("Nomor yang Anda pilih belum tersedia");
            }

//      Apakah mengulang lagi atau selesai
            System.out.print("\nLagi (y/n)? : ");
            lagi = scn2.next().charAt(0);
        } while (lagi != 'n');
    }
}

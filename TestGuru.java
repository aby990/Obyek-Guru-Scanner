//Driver class
import java.util.Scanner;

public class TestGuru {
    public static void main(String[] args) {
        //membuat obyek
        Guru BuAul = new Guru();
        Guru BuPasha = new Guru();
        Guru PakDiaur = new Guru();
        Guru BuFeni = new Guru();
        Guru PakAyat = new Guru();

        Guru munif = new Guru(10,"Pak Munif", "Pai", "malang");
        Guru feni = new Guru(90, "Bu Feni", "Matematika", "malang");


        BuAul.id = 1;
        BuAul.nama = "Bu aul";
        BuAul.mapel = "Keahlian RPL";
        BuAul.alamat = "Malang";

        BuPasha.id = 2;
        BuPasha.nama = "Bu Pasha";
        BuPasha.mapel = "Keahlian RPL";
        BuPasha.alamat = "Malang";

        PakDiaur.id = 3;
        PakDiaur.nama = "Pak Diaur";
        PakDiaur.mapel = "IPAS";
        PakDiaur.alamat = "Malang";

        BuFeni.id = 4;
        BuFeni.nama = "Bu Feni";
        BuFeni.mapel = "Matematika";
        BuFeni.alamat = "Malang";

        PakAyat.id = 5;
        PakAyat.nama = "Pak ayat";
        PakAyat.mapel = "UI/UX Design";
        PakAyat.alamat = "Malang"; 

        System.out.println("Data Bu Aul");
        System.out.println(BuAul.id);
        System.out.println("Nama = "+BuAul.nama);
        System.out.println("Mapel = "+BuAul.mapel);
        System.out.println("Alamat = "+BuAul.alamat);

        System.out.println("Data Bu Pasha");
        System.out.println (BuPasha.id);
        System.out.println("Nama = "+BuPasha.nama);
        System.out.println("Mapel = "+BuPasha.mapel);
        System.out.println("Alamat = "+BuPasha.alamat);

        System.out.println("Data Pak Diaur");
        System.out.println(PakDiaur.id);
        System.out.println("Nama = "+PakDiaur.nama);
        System.out.println("Mapel = "+PakDiaur.mapel);
        System.out.println("Alamat = "+PakDiaur.alamat);

        System.out.println("Data Bu feni");
        System.out.println(BuFeni.id);
        System.out.println("Nama = "+BuFeni.nama);
        System.out.println("Mapel = "+BuFeni.mapel);
        System.out.println("Alamat = "+BuFeni.alamat);

        System.out.println("Data Pak Ayat ");
        System.out.println(PakAyat.id);
        System.out.println("Nama = "+PakAyat.nama);
        System.out.println("Mapel = "+PakAyat.mapel);
        System.out.println("Alamat = "+PakAyat.alamat);
        
        munif.print();
        feni.print();


    }
}
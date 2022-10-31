public class Main {
    public static void main(String[] args) {
        // Membuat Objek
        Mahasiswa anton = new Mahasiswa();
        Pegawai manager = new Manager();
        Pegawai programmer = new Programmer();

        System.out.println("===== PRAKTIKUM 3 =====");
        // Memanggil atribut dan memberi nilai
        anton.nama = "Anton Santoso";
        anton.jenisKelamin = "Laki-laki";
        anton.umur = 28;
        anton.alamat = "Bekasi Kota";

        anton.cetakInfo();

        // TUGAS PERTEMUAN 6
        System.out.println("\n\n===== TUGAS PERT6 =====\n");
        System.out.println("=== MANAGER ===");
        manager.cetakInfo();

        System.out.println();

        System.out.println("=== PROGRAMMER ===");
        programmer.cetakInfo();


    }
}
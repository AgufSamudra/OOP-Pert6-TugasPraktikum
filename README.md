# Praktikum dan Tugas OOP Pertemuan 6

## Praktikum

Praktikum pertemuan 6 membahas mengenai implementasi Inheritance pada Java, serta di tambah penerapan Getter da Setter pada praktikum. Ada tiga file yaitu,
- Main.java (File Utama)
- Manusia.java (File Induk)
- Mahasiswa.java (File Anak)

Di dalam class **Manusia.java** hanya terdiri dari beberapa atribut dan fungsi cetakInfo(),
```java
public class Manusia {
    String nama;
    String jenisKelamin;
    int umur;
    String alamat;

    public void cetakInfo(){
        System.out.println("Nama          :" + this.nama);
        System.out.println("Jenis Kelamin :" + this.jenisKelamin);
        System.out.println("Umur          :" + this.umur);
        System.out.println("Alamat        :" + this.alamat);
    }
}
```

Dan melakukan Getter Setter pada file anak yaitu **Mahasiswa.java**
```java
public class Mahasiswa extends Manusia{
    private String nim;
    private String jurusan;

    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getNim() {
        return nim;
    }
    
    ...
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        setNim("312110300");
        setJurusan("Informatika");

        System.out.println("NIM           :" + getNim());
        System.out.println("Jurusan       :" + getJurusan());
    }
}
```

Setelah semua di atur kita tinggal membuat objeknya di dalam file utama yaitu **Main.java**, sekaligus mengisi beberapa atribut yang belum di isi pada Class **Manusia.java** serta memanggil method cetakInfo().

# Tugas Pertemuan 6

Pada tugas kita di minta untuk membuat program dengan penerapan Inheritance dengan 4 file yaitu,
- Main.java (File Utama)
- Pegawai.java (File Induk)
- Manager.java (File Anak)
- Programmer.java (File Anak)

Dan alur penerapannya sudah di bentuk dalam diagram, kita di minta untuk mengikuti diagram tersebut sehingga program berhasil di jalankan di dalam console. Dan tools yang saya gunakan adalah Intillej IDEA.

![diagram](https://raw.githubusercontent.com/AgufSamudra/OOP-Pert6-TugasPraktikum/main/tugas.png)

Pertama saya membuat terlebih dahulu untuk kelas Induknya yaitu **Pegawai.java** dan membuat method kosong bernama ***cetakInfo()***
```java
public class Pegawai {
    protected String nama;
    protected double gajiPokok;

    ...

    public void cetakInfo(){}
}
```

Kemudian kita akan mengisi atribut pada Pegawai di dalam kelas Anaknya agar lebih fleksibel, sehingga kedua file anak yaitu **Manager.java** dan **Programmer.java** akan mengisi masing masing atribut *nama* dan *gajiPokok*.

**Manager.java**
```java
public class Manager extends Pegawai {
    
    ...

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        cetakTunjangan();
    }

    public void cetakTunjangan() {
        setNama("Gufranaka Saudra");
        setGajiPokok(9000000);
        setTunjangan(3000000);

        System.out.println("Nama: " + getNama());
        System.out.println("Gaji Pokok: " + getGajiPokok());
        System.out.println("Tunjangan: " + getTunjangan());


    }
}
```

Kemudian, **Programmer.java**
```java
public class Programmer extends Pegawai{

    ...

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        cetakBonus();
    }

    public void cetakBonus(){
        setNama("Muhammad Anggi Pratama");
        setGajiPokok(4000000);
        setBonus(1200000);

        System.out.println("Nama: " + getNama());
        System.out.println("Gaji Pokok: " + getGajiPokok());
        System.out.println("Bonus: " + getBonus());
    }
}
```

Setelah semua di isi maka Full code **Main.java** jadi seperti berikut,
```java
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
```

## Dan hasil akhir akan jadi seperti berikut

![output](https://github.com/AgufSamudra/OOP-Pert6-TugasPraktikum/blob/main/Screenshot%20(17).png?raw=true)


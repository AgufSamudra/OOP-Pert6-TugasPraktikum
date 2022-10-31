public class Mahasiswa extends Manusia{
    private String nim;
    private String jurusan;

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        setNim("312110300");
        setJurusan("Informatika");

        System.out.println("NIM           :" + getNim());
        System.out.println("Jurusan       :" + getJurusan());
    }
}

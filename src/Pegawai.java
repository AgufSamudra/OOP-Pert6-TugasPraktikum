public class Pegawai {
    protected String nama;
    protected double gajiPokok;

    // SETTER
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    // GETTER
    public String getNama(){
        return nama;
    }
    public double getGajiPokok(){
        return gajiPokok;
    }

    public void cetakInfo(){}
}

public class Manager extends Pegawai {
    protected double tunjangan;

    // SETTER
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    // GETTER
    public double getTunjangan() {
        return tunjangan;
    }

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

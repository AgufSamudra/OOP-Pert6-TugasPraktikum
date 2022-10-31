public class Programmer extends Pegawai{

    protected double bonus;

    // SETTER
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    // GETTER
    public double getBonus(){
        return bonus;
    }

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

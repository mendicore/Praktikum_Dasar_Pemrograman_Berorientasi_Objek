public class Kendaraan {
    protected String namaKendaraan;
    public Kendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getInfo() {
        return "Kendaraan: " + namaKendaraan;
    }
}

public class Motor extends Kendaraan {

    public Motor(String namaKendaraan){
        super(namaKendaraan);
    }
    
    public String getInfo(){
        return "Motor: "+ namaKendaraan;
    }
}

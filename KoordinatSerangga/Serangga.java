public class Serangga {
    private int jumlahKaki;
    private String warna;

    public Serangga(String warna) {
        this.warna = warna;
    }
    
    public void gerak(int[] sumbu){
         
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public String getWarna() {
        return warna;
    }
    
    public void info(){
        System.out.print(this.warna);
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
}

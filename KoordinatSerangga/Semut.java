public class Semut extends Serangga {
    private Koordinat posisi;

    public Semut(String warna, int x, int y) {
        super(warna);
        this.posisi = new Koordinat(x, y);
    }
    
    @Override   
    public void gerak(int[] sumbu){
        posisi.setX(sumbu[0]);
        posisi.setY(sumbu[1]);
    }
    
    @Override
    public void info(){
        System.out.printf("\tX = %d\n\t\tY = %d\n", posisi.getX(), posisi.getY());
    }
}

public class Lebah extends Serangga implements BisaTerbang{
    private Koordinat3D posisi3D;

    public Lebah(String warna, int x, int y, int z) {
        super(warna);
        this.posisi3D = new Koordinat3D(x, y, z);
    }
    
    @Override
    public void gerak(int[] sumbu){
        posisi3D.setX(sumbu[0]);
        posisi3D.setY(sumbu[1]);
        posisi3D.setZ(sumbu[2]);
    }
    
    @Override
    public void info(){
         System.out.printf("\tX = %d\n\t\tY = %d\n\t\tZ = %d\n", posisi3D.getX(), posisi3D.getY(), posisi3D.getZ());
    }
    
    @Override
    public void terbang(int x, int y, int z){
        posisi3D.setX(posisi3D.getX() + x);
        posisi3D.setY(posisi3D.getY() + y);
        posisi3D.setZ(posisi3D.getZ() + z);
    }
}

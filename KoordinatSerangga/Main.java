public class Main {

    public static void main(String[] args) {
        Semut S = new Semut("Hitam", 60, 80);
        System.out.println("Warna Semut  :  " + S.getWarna());
        System.out.print("Posisi Semut : ");
        S.info();
        S.gerak(new int[]{70, 90});
        System.out.print("Posisi Semut : ");
        S.info();

        Lebah L = new Lebah("Kuning", 20, 30, 40);
        System.out.println("Warna Lebah  :  " + L.getWarna());
        System.out.print("Posisi Lebah : ");
        L.info();
        L.terbang(55, 65, 75);
        System.out.print("Posisi Lebah : ");
        L.info();
        L.gerak(new int[]{25, 35, 45});
        System.out.print("Posisi Lebah : ");
        L.info();
    }
}

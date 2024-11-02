public class Main {

    public static void main(String[] args) {
        Appliance[] list = new Appliance[2];
        
        list[0] = new Television("Television", "Kamar Keluarga", 42);
        list[1] = new Audio("Audio", "Kamar mandi", "Biru");
        
        for(Appliance x : list){
            System.out.println(x.turnOn());
            System.out.println(x.turnOff());
        }        
    }
}

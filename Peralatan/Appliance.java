public class Appliance {
    private String product;
    private String place;

    public Appliance(String product, String place) {
        this.product = product;
        this.place = place;
    }
    
    public String turnOn(){
        return this.product+ ": On";
    }
    
    public String turnOff(){
        return this.product+ ": Off";
    }

    public void setProduct(String product) {
        this.product = product;
    }
}

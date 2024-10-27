public class FundAccount extends Account{
    private double earningRate;

    public FundAccount(String number, String name, int balance, double earningRate) {
        super(number, name, balance);
        this.earningRate = earningRate;
    }

    public double getEarningRate() {
        return earningRate;
    }
    
    public void earnMoney(){
        double earning = earningRate * getBalance();
        if(earning > getBalance()){
            System.out.println("Keuntungan telah diperoleh.");
        }else{
            System.out.println("Keuntungan tidak diperoleh.");
        }
    }
    
    @Override
    public void openAccount(){
        System.out.println("Buka akun.");
    }
}

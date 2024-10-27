public class Main {

    public static void main(String[] args) {
        FundAccount akun = new FundAccount("111-2222", " Hong Gil-Dong", 5000000, 4.7);
        
        akun.openAccount();
        System.out.println("Nomor rekening: "+ akun.getNumber());
        System.out.println("Pemilik akun: "+ akun.getName());
        System.out.println("Saldo: Rp."+ akun.getBalance());
        System.out.println("Tingkat pengembalian: "+ akun.getEarningRate()+ "%");
        akun.earnMoney(); 
    }
}

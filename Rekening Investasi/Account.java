public abstract class Account {
    private String number;
    private String name;
    private int    balance;

    public Account(String number, String name, int balace) {
        this.number = number;
        this.name = name;
        this.balance = balace;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalace(int balace) {
        this.balance = balance;
    }
    
    public abstract void openAccount();
}

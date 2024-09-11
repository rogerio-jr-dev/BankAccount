package entities;

public class Account {
    private int number;
    private String name;
    private double bankBalance;

    // 3 Sobrecargas
    public Account() {
    }

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double bankBalance) {
        this.number = number;
        this.name = name;
        this.bankBalance = bankBalance;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void deposit(double value) {
        this.bankBalance += value;
    }

    public void withdraw(double value) {
        this.bankBalance -= value + 5.00;
    }

    public String toString() {
        return "Account "
                + getNumber()
                + ", Holder: "
                + getName()
                + ", Balance: $ "
                + String.format("%.2f", getBankBalance());
    }
}

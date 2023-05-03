package herancaPolimorfismo.entitis;

public class BusinessAccount extends account {

    private Double loadLimit;

    public BusinessAccount(Integer number, String holder, Double balance, Double loadLimit) {
        super(number, holder, balance);
        this.loadLimit = loadLimit;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

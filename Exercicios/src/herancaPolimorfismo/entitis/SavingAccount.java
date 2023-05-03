package herancaPolimorfismo.entitis;

public class SavingAccount extends  account {

    public SavingAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
    }
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}

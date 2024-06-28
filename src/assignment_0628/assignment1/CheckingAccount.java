package assignment_0628.assignment1;

public class CheckingAccount extends Account{
    private String cardNo;

    CheckingAccount() {
        super();
    }

    @Override
    public void calcRate() {

    }

    public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
        super(accId, balance, ownerName);
        this.cardNo = cardNo;
    }

    public void pay(String cardNo, long amount) {
        if (this.cardNo.equals(cardNo) && this.getBalance() >= amount) {
            this.setBalance(this.getBalance() - amount);
        }
    }
}

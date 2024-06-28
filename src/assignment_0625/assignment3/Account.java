package assignment_0625.assignment3;

public class Account {
    private String accNo;
    private int balance;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
        System.out.println(this.accNo + " 계좌가 개설되었습니다.");
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void save(int depositAmount) {
        this.balance += depositAmount;
        System.out.println(this.accNo + " 계좌에 " + depositAmount + "만원이 입급되었습니다.");
    }

    public void withdrawal(int withdrawalAmount) {
        if (this.balance >= withdrawalAmount) {
            this.balance -= withdrawalAmount;
            System.out.println(this.accNo + " 계좌에 " + withdrawalAmount + "만원이 출급되었습니다.");
        } else {
            System.out.println(this.accNo + " 계좌의 출금 가능 금액은 " + this.balance + "만원입니다.");
        }
    }
}

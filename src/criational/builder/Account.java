package criational.builder;

import java.util.Calendar;

public class Account {
    private int id;
    private AccountType type;
    private Calendar start;
    private Calendar end;
    private double balance;
    private double commission;

//    public Account() {
//    }
//
//    public Account(int id, AccountType type, Calendar start, Calendar end, double balance, double commission) {
//        this.id = id;
//        this.type = type;
//        this.start = start;
//        this.end = end;
//        this.balance = balance;
//        this.commission = commission;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public Calendar getStart() {
        return start;
    }

    public void setStart(Calendar start) {
        this.start = start;
    }

    public Calendar getEnd() {
        return end;
    }

    public void setEnd(Calendar end) {
        this.end = end;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", type=" + type +
                ", start=" + start +
                ", end=" + end +
                ", balance=" + balance +
                ", commission=" + commission +
                '}';
    }
}

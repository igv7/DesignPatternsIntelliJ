package criational.builder;

import java.util.Calendar;

public abstract class AccountBuilder {

    protected static int currentAccountId = 0;
    protected Account account;

    public void createNewAccount() { account = new Account(); }

    public Account getAccount() {
        return account;
    }

    public abstract void setId();
    public abstract void setCommission();
    public abstract void setType();
    public void  setStartDate() {
        account.setStart(Calendar.getInstance());
    }
}

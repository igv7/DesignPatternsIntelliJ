package criational.builder;

public class RegularAccountBuilder extends AccountBuilder {
    @Override
    public void setId() {
        account.setId(currentAccountId++);
    }

    @Override
    public void setCommission() {
        account.setCommission(0.7);
    }

    @Override
    public void setType() {
        account.setType(AccountType.REGULAR);
    }
}

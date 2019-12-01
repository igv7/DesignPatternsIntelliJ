package criational.builder;

public class PlatinumAccountBuilder extends AccountBuilder {
    @Override
    public void setId() {
        account.setId(currentAccountId++);
    }

    @Override
    public void setCommission() {
        account.setCommission(0.3);
    }

    @Override
    public void setType() {
        account.setType(AccountType.PLATINUM);
    }
}

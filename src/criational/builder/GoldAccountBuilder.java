package criational.builder;

public class GoldAccountBuilder extends AccountBuilder {
    @Override
    public void setId() {
        account.setId(currentAccountId++);
    }

    @Override
    public void setCommission() {
        account.setCommission(0.5);
    }

    @Override
    public void setType() {
        account.setType(AccountType.GOLD);
    }
}

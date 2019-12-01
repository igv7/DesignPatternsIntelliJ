package criational.builder;

public class Test {
    public static void main(String[] args) {

        RegularAccountBuilder regular = new RegularAccountBuilder();
        GoldAccountBuilder gold = new GoldAccountBuilder();
        PlatinumAccountBuilder platinum = new PlatinumAccountBuilder();

        createAndPrint(regular);
        System.out.println("********************************************");
        createAndPrint(gold);
        System.out.println("********************************************");
        createAndPrint(platinum);

//        createAndPrint(new RegularAccountBuilder());
//        System.out.println();
//        createAndPrint(new GoldAccountBuilder());
//        System.out.println();
//        createAndPrint(new PlatinumAccountBuilder());
    }

    public static void createAndPrint(AccountBuilder builder) {
        AccountDirector director = new AccountDirector();
        director.setAccountBuilder(builder);
        director.constructAccount();
        Account account = director.getAccount();
        System.out.println(account);
    }
}

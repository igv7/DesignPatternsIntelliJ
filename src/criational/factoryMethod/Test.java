package criational.factoryMethod;

public class Test {
    public static void main(String[] args) {

//        Android android = new Android();
//        android.button();
//        android.display();

//        Mobile mobile = new IPhone();
//        mobile.button();
//        mobile.display();

        Mobile mobile = createMobile("IPhone");
        mobile.button();
        mobile.display();


    }
    //Factory Method
    public static Mobile createMobile(String type) {
        if(type.equalsIgnoreCase("Android")) {
            return new Android();
        }
        else if (type.equalsIgnoreCase("IPhone")) {
            return new IPhone();
        }
        return null;
    }
}

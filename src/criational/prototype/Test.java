package criational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Box b1 = new Box(5,5,5);
        System.out.println(b1);

        Box b2 = b1;
        System.out.println("Object Reference");
        b1.setC(7);
        System.out.println("b1 "+b1);
        System.out.println("b2 "+b2);

        System.out.println("Cloneable");
//        Box b3 = (Box)b1.clone();
        Box b3 = b1.makeACopy(b1);
        System.out.println("b1 "+b1);
        System.out.println("b3 "+b3);
        System.out.println();
        b1.setC(8);
        System.out.println("b1 "+b1);
        System.out.println("b3 "+b3);

    }
}

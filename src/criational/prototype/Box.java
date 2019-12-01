package criational.prototype;

public class Box implements Cloneable {
    private int a;
    private int b;
    private int c;

    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Box{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    protected Box makeACopy(Box b) throws CloneNotSupportedException {
        Box cloned = (Box)b.clone();
        return cloned;
    }
}

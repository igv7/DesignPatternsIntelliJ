package structural.proxy;

public class Test {
    public static void main(String[] args) {
//        Capitalizer capitalizer = new UpperCaseCapitalizer();
//        System.out.println(capitalizer.modify("hello"));
//        System.out.println(capitalizer.modify("world"));
//        System.out.println(capitalizer.modify("I love design patterns"));
//        System.out.println(capitalizer.modify("hello"));

        CapitalizerCacheProxy capitalizerCacheProxy = new CapitalizerCacheProxy();
        System.out.println(capitalizerCacheProxy.modify("hello"));
        System.out.println(capitalizerCacheProxy.modify("world"));
        System.out.println(capitalizerCacheProxy.modify("I love design patterns"));
        System.out.println(capitalizerCacheProxy.modify("hello"));
    }
}

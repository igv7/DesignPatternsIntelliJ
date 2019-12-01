package structural.proxy;

import java.util.Hashtable;

public class CapitalizerCacheProxy implements Capitalizer {
    Hashtable<String, String> cache = new Hashtable<String, String>();
    UpperCaseCapitalizer upperCaseCapitalizer = new UpperCaseCapitalizer();
    @Override
    public String modify(String str) {
        String value = cache.get(str);
        if (value == null) {
            String newValue = upperCaseCapitalizer.modify(str);
            cache.put(str, newValue);
            return newValue;
        }
        return value + " From proxy";
    }
}

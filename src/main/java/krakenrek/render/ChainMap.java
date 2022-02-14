package krakenrek.render;

import java.util.HashMap;
import java.util.Map;

public class ChainMap<K, V> extends HashMap<K, V> {

    public ChainMap<K, V> putC(K key, V value) {
        put(key, value);
        return this;
    }
}

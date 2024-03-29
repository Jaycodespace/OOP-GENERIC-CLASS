package MyMap;

import java.util.ArrayList;

class MyMap<Key, Value> {
    private final ArrayList<Key> keys;
    private final ArrayList<Value> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(Key key, Value value) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            values.set(index, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public Value get(Key key) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            return values.get(index);
        }
        return null;
    }

    public Value remove(Key key) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            keys.remove(index);
            return values.remove(index);
        }
        return null;
    }
}

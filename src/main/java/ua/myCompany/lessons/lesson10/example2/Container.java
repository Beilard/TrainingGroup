package ua.myCompany.lessons.lesson10.example2;

public class Container<K, V> {
    private K key;
    private V value;

    public Container(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

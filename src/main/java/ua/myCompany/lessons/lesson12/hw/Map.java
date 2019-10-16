package ua.myCompany.lessons.lesson12.hw;

import java.util.Collection;
import java.util.Set;

//implement everything, self-increase in size: 80% -> 2 * capacity and re-arrange the buckets;
public interface Map<K, V> {
    void put(K key, V value);

    V getByKey(K key);

    int size();

    boolean isEmpty();

    Collection<V> getAllVales();

    Set<MapImpl<K, V>.Bucket<K, V>> getAllKeys();
}

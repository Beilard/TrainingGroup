package ua.myCompany.lessons.lesson12.hw;

import java.util.*;

public class MapImpl<K, V> implements Map<K, V> {
    private Bucket[] bucketArray;
    private int initialCapacity = 16;
    private int size = 0;
    private double loadingFactor = 0.80;


    MapImpl() {
        bucketArray = new Bucket[initialCapacity];
    }

    MapImpl(int capacity) {
        bucketArray = new Bucket[capacity];
    }

    @SuppressWarnings("unchecked")
    @Override
    public void put(K key, V value) {
        if (key == null) {
            throw new RuntimeException("The key is null");
        }
        int hashValue = hashValue(key);
        Bucket<K, V> bucket = new Bucket<>(key, value, null);
        if (bucketArray[hashValue] == null) {
            bucketArray[hashValue] = bucket;
        } else {
            Bucket<K, V> previous = null;
            Bucket<K, V> current = bucketArray[hashValue];
            while (current != null) {
                if (current.key.equals(key)) {
                    if (previous == null) {
                        bucket.next = current.next;
                        bucketArray[hashValue] = bucket;
                    } else {
                        bucket.next = current.next;
                        previous.next = bucket;
                    }
                    previous.next = bucket;
                }
            }
            size++;
            capacityManagement();
            bucketArray[hashValue].next = bucket;
        }
    }

    public boolean remove(K key) {
        if (key == null) {
            return false;
        }
        // hash value of the key
        int hashValue = hashValue(key);
        if (bucketArray[hashValue] == null) {
            return false;
        } else {
            Bucket<K, V> previous = null;
            Bucket<K, V> current = bucketArray[hashValue];
            while (current != null) {
                if (current.key.equals(key)) {
                    if (previous == null) {
                        bucketArray[hashValue] = bucketArray[hashValue].next;
                        return true;
                    } else {
                        previous.next = current.next;
                        return true;
                    }
                }
                previous = current;
                current = current.next;
            }
            return false;
        }
    }

    @Override
    public V getByKey(K key) {
        int hash = hashValue(key);
        if (bucketArray[hash] == null) {
            throw new RuntimeException("Key is null");
        }
        Bucket<K, V> dud = bucketArray[hash];
        while (dud != null) {
            if (dud.key.equals(key)) {
                return dud.value;
            }
            dud = dud.next;
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Collection<V> getAllVales() {
        return (Collection<V>) Arrays.asList(bucketArray);
    }

    @Override
    public Set<Bucket<K, V>> getAllKeys() {
        Set<Bucket<K, V>> keySet = new HashSet<>();
        for (int i = 0; i < bucketArray.length; i++) {
            keySet.add(bucketArray[i]);
        }
        return keySet;
    }

    private int hashValue(K key) {
        return key.hashCode() % initialCapacity;
    }

    private void capacityManagement() {
        if (size >= bucketArray.length * loadingFactor) {
            Bucket[] newBucketArray = new Bucket[bucketArray.length * 2];
            System.arraycopy(bucketArray, 0, newBucketArray, 0, size);
        }
    }

    public double getLoadingFactor() {
        return loadingFactor;
    }

    public void setLoadingFactor(double loadingFactor) {
        this.loadingFactor = loadingFactor;
    }


    class Bucket<K, V> {
        private K key;
        private V value;
        Bucket<K, V> next;

        public Bucket(K key, V value, Bucket<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Bucket<K, V> getNext() {
            return next;
        }

        public void setNext(Bucket<K, V> next) {
            this.next = next;
        }
    }

}

package ua.myCompany.homework.homework10;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {
    private E[] contents;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int size;

    public ArrayList() {
        capacity = DEFAULT_CAPACITY;
        contents = (E[]) new Object[capacity];
    }

    public ArrayList(int capacity) {
        this.capacity = capacity;
        if (size < 0) {
            throw new IllegalArgumentException("Array size cannot be lower than 0!");
        }
        contents = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(E element) {
        if (++size == capacity) {
            capacity *= 2;
            E[] newContents = (E[]) new Object[capacity];
            System.arraycopy(contents, 0, newContents, 0, size);
        }
        contents[size] = (E) element;
    }

    @Override
    public E getByIndex(int index) {
        if (index < 0 || index > contents.length) {
            throw new IllegalArgumentException("Index is not in array's bounds");
        }
        return contents[index];
    }

    @Override
    public boolean remove(E element) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (contents[i] == element) {
                index = i;
                break;
            }
        }

        System.arraycopy(contents, index + 1, contents, index, size - index);
        size--;
        if (size < capacity * 0.25) {
            capacity /= 2;
            E[] newContents = (E[]) new Object[capacity];
            System.arraycopy(contents, 0, newContents, 0, size);
        }
        return true;
    }

    @Override
    public void clean() {
        capacity = DEFAULT_CAPACITY;
        size = 0;
        contents = (E[]) new Object[capacity];
    }
}

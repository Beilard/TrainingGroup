package ua.myCompany.homework.homework10;

public class LinkedLIst<T> implements List {
    private int size;
    private Node<T> root;

    

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void add(Object element) {
    }

    @Override
    public Object getByIndex(int index) {
        return null;
    }

    @Override
    public boolean remove(Object element) {
        return false;
    }
    @Override
    public void clean() {

    }

    private class Node<T> {
        private Node nextNode;
        T content;

        public Node(T content) {
            this.content = content;
        }
    }
}

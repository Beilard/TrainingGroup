package ua.myCompany.homework.homework10;

import java.util.Objects;

public class LinkedList<T> implements List<T> {
    private int size;
    private Node<T> head;

    public LinkedList() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<T>((T) element);
        newNode.nextNode = null;
        if (this.isEmpty()) {
            this.head = newNode;
        }
        Node last = this.head;
        while (last.nextNode != null) {
            last = last.nextNode;
        }
        size++;
    }

    @Override
    public T getByIndex(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Index is out of bounds!");
        }
        Node target = head;
        for (int i = 0; i < size; i++) {
            target = target.nextNode;
            if (i == index) {
                break;
            }
        }
        return (T) target;
    }

    @Override
    public boolean remove(T element) {
        Node<T> target = head;
        while (element != target.nextNode) {
            if (target.nextNode != null) {
                target = target.nextNode;
            } else {
                return false;
            }
        }
        Node temp = target.nextNode;
        target.nextNode = temp.nextNode;
        temp.nextNode = null;
        size--;
        return true;
    }

    @Override
    public void clean() {
        head = null;
        size = 0;
    }

    class Node<T> {
        private Node nextNode;
        T content;

        Node(T content) {
            this.content = content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(nextNode, node.nextNode) &&
                    Objects.equals(content, node.content);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nextNode, content);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedList<?> list = (LinkedList<?>) o;
        return size == list.size &&
                Objects.equals(head, list.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, head);
    }
}

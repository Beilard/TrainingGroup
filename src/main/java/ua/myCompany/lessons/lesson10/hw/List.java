package ua.myCompany.lessons.lesson10.hw;

public interface List<E> {
    int size();
    boolean isEmpty();
    void add(E element);
    E getByIndex(int index);
    boolean remove(E element);
}

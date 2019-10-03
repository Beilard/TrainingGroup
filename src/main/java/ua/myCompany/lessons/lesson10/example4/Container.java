package ua.myCompany.lessons.lesson10.example4;

public class Container<T extends Number> {
    private final T[] items;

    public Container(T... items) {
        this.items = items;
    }

    //you need to extend the generic to a specific type
    public double averageValue() {
        double result = 0;
        for (T t : items) {
            result += t.doubleValue();
        }
        return result/items.length;
    }

    //?
    public boolean isEqual(Container<? extends Number> container) {
        return (int)this.averageValue() - (int)container.averageValue() == 0;
    }
}

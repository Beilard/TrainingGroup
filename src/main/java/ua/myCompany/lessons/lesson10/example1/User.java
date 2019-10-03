package ua.myCompany.lessons.lesson10.example1;

public class User implements /*Comparable<A>, */ Comparable<B> {
    @Override
    public int compareTo(B o) {
        return 0;
    }
}

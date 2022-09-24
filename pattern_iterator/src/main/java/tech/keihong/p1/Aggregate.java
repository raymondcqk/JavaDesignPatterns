package tech.keihong.p1;

public interface Aggregate<T> {

    Iterator<T> iterator();


    int size();

    boolean add(T item);

    T getAt(int index);
}

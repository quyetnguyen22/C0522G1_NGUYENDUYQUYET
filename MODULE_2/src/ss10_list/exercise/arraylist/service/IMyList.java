package ss10_list.exercise.arraylist.service;

public interface IMyList<E> {
    void add(int index, E element);
    E remove(int index);
    int size();
    E clone();
    boolean contains(E o);
    int indexOf(E o);
    boolean add(E o);
    void ensureCapacity(int minCapacity);
    E get (int i);
    void clear();
    void checkIndex(int index);
}

package ss10_list.exercise.arraylist.service.impl;
import ss10_list.exercise.arraylist.model.MyList;
import ss10_list.exercise.arraylist.service.IMyList;

public class MyListService<E> implements IMyList {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyListService() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    @Override
    public void add(int index, Object element) {
        ensureCapacity(index);
        for (int i = size - 1; i >= index; i--)
        elements[i + 1] = elements[i];
        elements[index] = element;

    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object e = elements[index];
        for (int i = index; i < size - 1; i++)
        elements[i] = elements[i + 1];
        elements[size - 1] = null;
        size--;
        return e;
    }

    @Override
    public int size() {
        int i;
        for (i = 0; i < elements.length; i++)
            if (elements[i] == null)
                break;
        return i;
    }

    @Override
    public E clone() {
        E[] newCopy = (E[]) (new Object[elements.length]);
        for (int i = 0; i < elements.length; i++)
            newCopy[i] = (E) elements[i];
        return null;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i]))
                return true;
        return false;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i]))
                return i;
        return -1;
    }

    @Override
    public boolean add(Object o) {
        ensureCapacity(elements.length);
        elements[size] = o;
        size++;
        return true;
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        if (size >= minCapacity) {
            E[] newElements = (E[]) (new Object[size * 2 + 1]);
            elements = newElements;
        }
    }

    @Override
    public Object get(int i) {
        checkIndex(i);
        return elements[i];
    }

    @Override
    public void clear() {
        elements = (E[]) (new Object[size * 2 + 1]);
        size = 0;
    }

}

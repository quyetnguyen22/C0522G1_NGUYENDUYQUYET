package ss10_list.exercise.arraylist.service.impl;
import ss10_list.exercise.arraylist.model.MyList;
import ss10_list.exercise.arraylist.service.IMyList;

public class MyListService<E> implements IMyList {
    MyList myList = new MyList();

    @Override
    public void add(int index, Object element) {
        ensureCapacity(index);
        for (int i = myList.getSize() - 1; i >= index; i--)
            myList.getElements()[i + 1] = myList.getElements()[i];
        myList.getElements()[index] = element;

    }

    public void checkIndex(int index) {
        if (index < 0 || index >= myList.getSize())
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object e = myList.getElements()[index];
        for (int i = index; i < myList.getSize() - 1; i++)
            myList.getElements()[i] = myList.getElements()[i + 1];
        myList.getElements()[myList.getSize() - 1] = null;
        myList.setSize(myList.getSize() - 1);
        return e;
    }

    @Override
    public int size() {
        int i;
        for (i = 0; i < myList.getElements().length; i++)
            if (myList.getElements()[i] != null)
                continue;
        return i;
    }

    @Override
    public E clone() {
        E[] newCopy = (E[]) (new Object[myList.getElements().length]);
        for (int i = 0; i < myList.getElements().length; i++)
            newCopy[i] = (E) myList.getElements()[i];
        return null;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < myList.getSize(); i++)
            if (o.equals(myList.getElements()[i]))
                return true;
        return false;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < myList.getSize(); i++)
            if (o.equals(myList.getElements()[i]))
                return i;
        return -1;
    }

    @Override
    public boolean add(Object o) {
        ensureCapacity(myList.getSize());
        myList.getElements()[myList.getSize()] = o;
        myList.setSize(myList.getSize() + 1);
        return true;
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        if (myList.getSize() >= minCapacity) {
            E[] newElements = (E[]) (new Object[myList.getSize() * 2 + 1]);
            myList.setElements(newElements);
        }
    }

    @Override
    public Object get(int i) {
        checkIndex(i);
        return myList.getElements()[i];
    }

    @Override
    public void clear() {
        myList.getElements();
        myList.setSize(0);
    }

}

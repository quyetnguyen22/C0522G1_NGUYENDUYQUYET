package ss10_list.exercise.arraylist.model;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
//    public MyList(int capacity) {
//    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
}

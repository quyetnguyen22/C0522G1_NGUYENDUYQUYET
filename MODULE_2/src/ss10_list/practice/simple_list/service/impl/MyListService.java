package ss10_list.practice.simple_list.service.impl;

import ss10_list.practice.simple_list.model.MyList;
import ss10_list.practice.simple_list.service.IMyList;

public class MyListService implements IMyList {
    MyList myList = new MyList();

    public void ensureCapa() {
        int newSize = myList.getElements().length * 2;
    }

    public void add(Object e) {
        if (myList.getSize() == (myList.getElements()).length) {
            ensureCapa();
        }
        myList.getElements()[myList.getSize()] = e;
        myList.setSize(myList.getSize() + 1);
    }

    public Object get(int i) {
        if (i > myList.getSize() || i < 0) {
            throw new IndexOutOfBoundsException("Index: ");
        }
        return (myList.getElements())[i];
    }

}

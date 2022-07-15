package ss10_list.exercise.arraylist.service.impl;

public class MyListTestService {
    public static void test() {
        MyListService myListService = new MyListService();
        myListService.add(1);
        myListService.add(2);
        myListService.add(5);
        myListService.remove(1);
        System.out.println("elemnent 1:" + myListService.get(0));
        System.out.println("elemnent 2:" + myListService.get(1));
        System.out.println("contains 3:" + myListService.contains(2));
        System.out.println("size 4:" + myListService.size());
    }

}

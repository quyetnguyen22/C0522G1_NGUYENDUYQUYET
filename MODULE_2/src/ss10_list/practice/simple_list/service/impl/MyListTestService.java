package ss10_list.practice.simple_list.service.impl;

public class MyListTestService  {
    public void test() {
        MyListService myListService = new MyListService();
        myListService.add(1);
        myListService.add(2);
        myListService.add(3);
        System.out.println("elemnent 1:" + myListService.get(0));
        System.out.println("elemnent 2:" + myListService.get(1));
        System.out.println("elemnent 3:" + myListService.get(2));
        System.out.println("elemnent 4:" + myListService.get(3));
    }

}

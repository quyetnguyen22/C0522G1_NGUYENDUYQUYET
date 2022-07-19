package ss11_stack_queue.exercise.count_word;

import java.util.*;

public class count {
    private static Scanner scanner = new Scanner(System.in);

    public static String[] addString() {
//        Able was I ere I was Elba i
        System.out.println("Input the string:");
        String str = scanner.nextLine();
//        str = str.toLowerCase();
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void addToMap() {
        Map<String, Integer> map = new TreeMap<>();
        String[] newArr = addString();
        for (String arr : newArr) {
            if (!map.containsKey(arr)) {
                map.put(arr, 1);
            } else {
                int count = map.get(arr); // gia tri cua key arr
                map.replace(arr, count + 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        addToMap();
    }

}

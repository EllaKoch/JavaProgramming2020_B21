package day52_Collection;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        // List(I) : has index numbers, accepts duplicated objects

        List<Integer> list1 = new ArrayList<>();//internally uses array. retrieving is faster(get())
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5));
        list1.removeIf(p -> p < 5);
        System.out.println(list1.get(4));// Faster

        System.out.println(list1);


        List<Integer> list2 = new LinkedList<>();// add()/remove() is faster than in Arraylist because it is doubly linked
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5));
        list2.removeIf(p -> p < 5);
        System.out.println(list2.get(4));
        System.out.println(list2);

        List<Integer> list3 = new Vector<>();// synchronized version of ArrayList.. One thread at a time
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,910,1,2,3,4,5));
        list3.removeIf(p -> p < 5);
        System.out.println(list3.get(4));
        System.out.println(list3);


        List<Integer> list4 = new Stack<>();// is synchronised, Thread safe, LIFO last In first Out
        list4.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list4);

        ((Stack<Integer>)list4).pop();
        System.out.println(list4);

        int l2 = ((Stack<Integer>)list4).pop();//4

        System.out.println(l2);//4
        System.out.println(list4);//[1,2,3]

        ((Stack<Integer>)list4).pop();

        System.out.println(list4);//[1,2]

        System.out.println("==================================================");

       Stack<String> names =  new Stack<>();
       names.addAll(Arrays.asList("Aysel", "Amir", "Mohammed", "Bursa", "Necdat", "Break"));

        System.out.println(names);
        names.pop();
        System.out.println(names);
        names.pop();
        System.out.println(names);
        names.pop();
        System.out.println(names);
        names.pop();
        System.out.println(names);
        names.pop();
        System.out.println(names);
        names.pop();
        System.out.println(names);


    }

    public synchronized void method1(){  // one thread at a time in multi-thread environment

    }

    public void method2(){

    }




}

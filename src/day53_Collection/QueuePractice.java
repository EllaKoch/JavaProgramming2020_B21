package day53_Collection;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 12, 9, 4, 11, 43, 23, 6, 5));// keeps the insertion order
        System.out.println("arrayDeque = " + arrayDeque);

        int i = arrayDeque.poll();// 10 ==> returns the first object inserted

        arrayDeque.poll();// 12
        System.out.println("arrayDeque = " + arrayDeque);//9, 4, 11, 43, 23, 6, 5 left

            // getFirst()  getLast() ==> deque
       int num1 =  (Integer)((ArrayDeque)arrayDeque).getFirst();// comes from deque, have to downcast Queue to deque to use getFirst()/ getLast()
        System.out.println(num1);
        System.out.println(((ArrayDeque) arrayDeque).getLast());


        // null

        //arrayDeque.add(null);// exception NullPointer

        // LinkedList ==> FIFO from QUEUE

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10, 12, 9, 4, 11, 43, 23, 6, 5));
        System.out.println("linkedList = " + linkedList);
        linkedList.poll();
        System.out.println("linkedList = " + linkedList);

        System.out.println(((LinkedList<Integer>) linkedList).get(0));//have to cast to linkedList since Queue does not have indexes
        System.out.println(((LinkedList<Integer>) linkedList).get(linkedList.size()-1));//have to cast to linkedList since Queue does not have indexes

        System.out.println(((LinkedList<Integer>) linkedList).getFirst());
        System.out.println(((LinkedList<Integer>) linkedList).getLast());

        linkedList.add(null);
        System.out.println("linkedList = " + linkedList);


        System.out.println("===========================================");

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10, 12, 9, 4, 11, 43, 23, 6, 5));

        System.out.println("priorityQueue = " + priorityQueue);
        priorityQueue.poll();// random poll since no indexes in priorityQueue



    }
}

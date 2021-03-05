package day53_Collection;

import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 91, 2, 3, 4, 56));

//        for(int i = 0; i<= list.size()-1; i++){
//           if( list.get(i)<5){
//               list.remove(i);
//           }
//        }//

        list.removeIf(p -> p < 5);// same as below

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {// hasNext and next correlate
            if (it.next() < 5) {
                it.remove();
            }
        }

        System.out.println("list = " + list);

        System.out.println("========================================");

        Set<Double> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(1.2, 2.1, 3.2, 4.2, 5.3, 6.4, 7.3, 8.5, 10.5, 2.5, 4.5, 3.2));
       // set.removeIf(p -> p < 4.5);
        System.out.println("set = " + set);

        for( Iterator<Double> i = set.iterator(); i.hasNext();){
            if(i.next()<4.5){
                i.remove();
            }
        }
        System.out.println("set = " + set);


        System.out.println("========================================");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "aHmed", "AhmeD", "John", "Ella"
        ));

       // names.removeIf(p->p.equalsIgnoreCase("ahmed"));// works internally with iterable
        System.out.println("========================================");

        Iterator<String> i = names.iterator();
        while (i.hasNext()){
            String eachName = i.next();
            if(eachName.equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }
        System.out.println(names);

    }
}

package Office_Hours.Practice_02_03_2021;

import java.util.*;

public class RemoveEvenNumbers {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 10, 11, 12, 13, 14, 15, 16};

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(numbers));

        System.out.println(set);
        //first solution
        // set.removeIf(p -> p % 2 == 0);
        //System.out.println(set);

        System.out.println("=====================================================");

        for (Iterator<Integer> it = set.iterator(); it.hasNext(); ) {
            Integer p = it.next();
            if (p % 2 == 0) {
                it.remove();
            }
        }

        System.out.println("set = " + set);

        System.out.println("=====================================================");
//solution 2 with while loop
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        System.out.println("set = " + set);

        System.out.println("=====================================================");

        Integer[] arr = {10, 10, 11, 11, 9, 9, 9, 9, 5, 5, 5, 6, 7, 4, 3, 2, 1};

        arr = new TreeSet<>(Arrays.asList(arr)).toArray(new Integer[0]);// returns Array
        System.out.println(Arrays.toString(arr));

        System.out.println("=====================================================");

        String[] names = {"J", "J", "A", "A", "A", "D", "C", "C", "B", "A", "A"};

        Set<String> st = new TreeSet<>();
        st.addAll(Arrays.asList(names));
        st.toArray(new String[0]);
        names = st.toArray(new String[1]);
        System.out.println("names = " + Arrays.toString(names));

    }
}

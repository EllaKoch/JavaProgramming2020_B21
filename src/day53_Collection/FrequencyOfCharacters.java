package day53_Collection;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbacaa";//
        String result = "";// a3b2c1 ==> a b c ==> 3 2 1

        for (String s : new LinkedHashSet<>(Arrays.asList(str.split("")))) {// s: each of the chars a,b,c
           int f =  Collections.frequency(Arrays.asList(str.split("")), s);// returns the frequency of s in str
            result+= s+f;
        }

        System.out.println("result = " + result);


        System.out.println("==============================");
        // List to Set
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,7,8,9);
        Set<Integer> set = new LinkedHashSet<>(list);


        // getWindowHandles() Set to List// to get access to indexes
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(1,2,3,4));
        List<Integer> list2 = new ArrayList<>(set2);

        System.out.println(list2.get(3));

    }
}

package day53_Collection;

import java.util.*;

public class FrequencyOfCharacters2 {
    public static void main(String[] args) {

        String str1 = "aaabbcc";
        Map<String, Integer> result1 = new LinkedHashMap<>();// removes duplicates

        for (String s : str1.split("")) {//["a","a","a","b","b","c","c"];
            int f = Collections.frequency(Arrays.asList(str1.split("")), s);

           // System.out.print(s+" ");
            result1.put(s,f);
        }

        System.out.println();
        System.out.println("result1 = " + result1);




        System.out.println("=================================================");

        String str2 = "aaabbcc";
        Map<String, Integer> result2 = new LinkedHashMap<>();// removes duplicates

        for (String s : new LinkedHashSet<>(Arrays.asList(str2.split("")))) {//["a","b","c"];
            int f = Collections.frequency(Arrays.asList(str2.split("")), s);
            result2.put(s,f);
        }

        System.out.println("result2 = " + result2);



    }
}

package day52_Collection;

import java.util.*;

public class SetPractice {

    static String str3;// no object

    public static void main(String[] args) {

        // no index number in SET

        Set<String> names1 = new HashSet<>();// order can be random
        names1.addAll(Arrays.asList("Dan", "Rus", "Adnana", "Serg", "Ercan", "Ercan"));
        System.out.println(names1);

        System.out.println("=================================================");

        Set<String> names2 = new LinkedHashSet<>();// keeps the insertion order
        names2.addAll(Arrays.asList("Dan", "Rus", "Adnana", "Serg", "Ercan","Dan"));
        System.out.println(names2);

        System.out.println("=================================================");

        Set<String> names3 = new TreeSet<>();// in sorted  in ascending order
        names3.addAll(Arrays.asList("Dan", "Rus", "Adnana", "Serg", "Ercan"));
        System.out.println(names3);

        System.out.println("==========================================");

        String str = "rrrrrrttttffffgggjjj";
        String result = "";
//        for (String s : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
//            result+=s;
//        }
//        String[] arr = str.split("");["r","t","f","g","j"]
//        System.out.println(Arrays.toString(arr));

        LinkedHashSet<String> hs = new LinkedHashSet<>(Arrays.asList(str.split("")));
        for (String each : hs) {
            result += each;
        }

        System.out.println(result);


        System.out.println("==========================================");
        String str1 = "silent";
        String str2 = "listen";

        String s1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        String s2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(s1.equals(s2));

        System.out.println("==========================================");

        // Null key:

        System.out.println(str3);

        // System.out.println(str3.toUpperCase());// NullPointerException

        HashSet<Integer> hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(hashSet);//[null]

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(null, null, null, null));
        System.out.println(linkedHashSet);//[null]

        TreeSet<Integer> treeSet = new TreeSet<>();
        // treeSet.addAll(Arrays.asList(null,null,null));//nullPointerException
        // System.out.println(treeSet);//nullPointerException

        String str4 = null;

        // System.out.println(str4.equals("Muhtar"));//nullPointerException

        System.out.println("==========================================");

        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        int maxNum = Collections.max(numbers);
        int minNum = Collections.min(numbers);

        // Collections.sort(numbers);
        //  Collections.swap(numbers, 0 , 1);

        //  Collections.frequency(numbers,5);  //1

        System.out.println("maxNum = " + maxNum);
        System.out.println("minNum = " + minNum);
        System.out.println("==============================================");

        /*
        dddaaaaccbb
                    dacb
                    3422
        output:
            d3a4c2b2
         */

        String s = "dddaaaaccbb";
        String outcome = "";

        LinkedHashSet<String> hashSet1 = new LinkedHashSet<>(Arrays.asList(s.split("")));

        for (String ea: hashSet1){
            outcome+= ea+Collections.frequency(Arrays.asList(s.split("")),ea);
        }
        System.out.println("outcome = " + outcome);

        }


    //SortedSet names4 = new TreeSet();// in sorted  in ascending order


}

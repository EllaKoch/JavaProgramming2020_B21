package day54_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Uniques_Duplicates {

    public static void main(String[] args) {
        String str = "aabcccdee";
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();//{ a=2, c=3, e=2}
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();//{ b=2, d=1}

        for (String each : str.split("")) {
            //map.put(each, Collections.frequency(Arrays.asList(str.split("")),each));
            int f = Collections.frequency(Arrays.asList( str.split("")), each);

            if(f>1){//for duplicated
                map.put(each,f);
            }

            if(f==1){// for uniques
                map2.put(each,f);
            }
        }
        System.out.println(map);
        System.out.println(map2);







    }

}

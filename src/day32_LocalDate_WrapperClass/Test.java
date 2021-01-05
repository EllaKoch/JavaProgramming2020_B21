package day32_LocalDate_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        // System.out.println(Arrays.toString(method("apple")));



        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 97, 2, 56, 46, 73, 6, 2, 3, 7));
        String s = "";

        for (int i = 0; i < list.size(); i++) {

            if (i == 2 || i == 5 || i == 9) {

                continue;

            }
            if (list.get(i)==2 || list.get(i) % 3 == 0) {
                s += "1";
            } else {
                s += "0";
            }


        }

        System.out.println(s);
    }
}
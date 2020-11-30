package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();

        chars.add('X');
        chars.add('Z');
        chars.add('Y');
        chars.add('W');
        chars.add('A');

        System.out.println(chars);

        Collections.sort(chars);
        System.out.println(chars);



    }
}

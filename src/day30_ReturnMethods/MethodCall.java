package day30_ReturnMethods;

import library.ArraysUtility;
import library.StringUtility;

import java.util.Arrays;

public class MethodCall {
    public static void main(String[] args) {

        String str = "Level";
        String reversedName = StringUtility.reverse(str);
        System.out.println(str.equalsIgnoreCase(reversedName));

        String str2 = "aaabccccccccbbbbdddeeeee";
        String nonDup = StringUtility.removeDuplicates(str2);
        System.out.println(nonDup);

        String str3 = "aabbcccdeee";

        String uniques = StringUtility.unique(str3);
        System.out.println(uniques);

        System.out.println("=====================================");

        int[] array = {1,0,-2,30,40,500,-20,-50};

        int[] descending = ArraysUtility.sort(array);

        System.out.println(Arrays.toString(descending));

        System.out.println(ArraysUtility.printArray(descending));

        String s1 = "abcaabbc";
        String s2 = "bbccaabc";

        boolean  r1 = StringUtility.isAnagram(s1,s2);
        System.out.println(r1);







    }
}

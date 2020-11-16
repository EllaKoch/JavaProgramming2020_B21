package day30_ReturnMethods;

import library.StringUtility;

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


    }
}

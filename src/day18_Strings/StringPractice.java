package day18_Strings;

public class StringPractice {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";

        System.out.println(s1 == s2);//true -> both values are same and saved as one
                                        // object in string pool

        String s3 = new String("Cat");

        System.out.println(s1 == s3);//false

        System.out.println(s2 == s3);//false

        String s4 = new String("Cat");

        System.out.println(s3 == s4);//false=> both are new objects saved in heap


        // equals() --> to compare the strings' text in both objects

        System.out.println(s1.equals(s3));//true
        System.out.println(s2.equals(s3));//true ->compares just the text but in it case sensitive

        System.out.println(s3.equals(s4));//true ->compares text

        String s5 = new String("cat");
        System.out.println(s4.equals(s5));//false, equals method is case sensitive

        System.out.println(s4.equalsIgnoreCase(s5));//true ->ignore case method

        System.out.println("===========================================");

        String str = "cybertek";
                     str = str.toUpperCase();//CYBERTEK

        System.out.println(str);

        str =  str.toLowerCase(); // "cybertek"

        System.out.println(str);//uppercase

        System.out.println("========================================");

        String name = "Elvira Kochkarova";//14
                                            // last index: 13

        int n1 = name.length();

        System.out.println(n1);

        String name2 = "Muhtar";//6 characters
                      //012345

        int n2 = name2.length();// 6
                                // last idex: 5
        int lastIndex = name2.length()-1;
        System.out.println(n2);
        System.out.println(lastIndex);

        System.out.println("==================================");
// char method
        String a = "Cybertek School";
        char firstChar = a.charAt(0);
        char lastChar = a.charAt(a.length()-1);

        System.out.println("First character: "+ firstChar);
        System.out.println("Last character: "+ lastChar);

        System.out.println("======================");

        String b = "Today is Monday";

        char secondChar = b.charAt(1);
        char secondToLastChar = b.charAt(b.length()-2);//-1-1
        System.out.println("secondChar = " + secondChar);
        System.out.println("secondToLastChar = " + secondToLastChar);




    }
}

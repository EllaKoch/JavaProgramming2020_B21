package day31_MethodOverLoading;

import library.StringUtility;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "Java java java python python";
        int count = StringUtility.frequencyOfWord(str, "java");
        System.out.println(count);

        String str2 = "java Java JaVa c#, C#, c#, java, java";

        int countJava = StringUtility.frequencyOfWord(str2,"java");
        int countCSharp = StringUtility.frequencyOfWord(str2,"c#");
        System.out.println("countCSharp = " + countCSharp);
        System.out.println("countJava = " + countJava);

        System.out.println("=========================================");

        String sentence = "dog dog dog Dog DOG doG cat cat cat CAT";
        int countDog = StringUtility.frequencyOfWord(sentence, "dog");
        int countCat = StringUtility.frequencyOfWord(sentence, "cat");

        System.out.println("countDog = " + countDog);
        System.out.println("countCat = " + countCat);

        System.out.println( countCat == countDog );

    }
}
/*
Task1:
        1.  write a return method called frequencyOfWord that accepts
        two parameters: string str and String word, then returns the frequency
        of word
                Ex:
                    str = "Java java java python python"
                    word = "java";
                    frequency(str, word) ==>  3

 */
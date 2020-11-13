package day23_NestedLoop;
/*
1. write a program that can return the frequency of the a word from the sentence
        Ex:
            sentence = "Java is a programming language, I like to learn Java";
            word = "Java";
            output:
                2

 */
public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java is a programming language, I like to learn Java Java Java Java";
        String word = "Java";
        int count = 0;

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");//we need to remove one at a time to
            // count the frequency, that y used replaceFirst instead of replace all
            count++;
        }

        System.out.println("count = " + count);
        System.out.println(sentence);

    }
}

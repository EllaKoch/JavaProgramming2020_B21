package Office_Hours.Practice_10_28_20;

public class FrequencyOfWord {
    public static void main(String[] args) {
            String sentence = "Cat Cat Cat Cat Cat";
            String word = "Dog";

            int count = 0 ;

            while(sentence.contains(word)){
                sentence = sentence.replaceFirst(word, "");
                count++;
            }

            System.out.println(count);

        }
}

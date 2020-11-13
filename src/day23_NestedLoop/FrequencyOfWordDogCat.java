package day23_NestedLoop;

public class FrequencyOfWordDogCat {
    public static void main(String[] args) {
        String sentence = "dog dog Dog Dog cat CaT cAt CAT";

        String temp = sentence.toLowerCase();//after this no need to worry about sensitivity


        int countDog = 0;
        int countCat = 0;

        while(temp.contains("dog")){
            temp = temp.replaceFirst("dog", "");
            countDog++;
        }
        System.out.println("Number of dogs: "+countDog);

        while(temp.contains("cat")){
            temp = temp.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println("Number of cats: "+countCat);

        System.out.println( countCat == countDog );



    }
}

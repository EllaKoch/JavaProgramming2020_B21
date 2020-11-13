package day26_Arrays;

/*
 6. print out the longest words from an array of String
            String[] words = {"Monday", "Apple", "Banana", "Strawberry", "Programmin"};
            output:
                Strawberry Blackberry

 */
public class LongestWordArray {
    public static void main(String[] args) {

        String[] words = {"Monday", "Apple", "Banana", "Strawberry", "Blackberry"};

        int lengthOfWord = 0;
        String nonDup = "";
        for (int j = 0; j <= words.length - 1; j++) {


            for (int i = 0; i <= words.length - 1; i++) {
                if (words[i].length() >= lengthOfWord) {
                    lengthOfWord = words[i].length();

                }
            }
            if (lengthOfWord == words[j].length()) {
                System.out.print(words[j] + " ");
            }

        }


//
//        for(int i = 0; i < words.length; i++) {
//            if (words[i].length() >= longestW) {
//                longestW = words[i].length();
//            }
//        }
//        for(int i = 0; i < words.length; i++) {
//            if (words[i].length() == longestW) {
//                System.out.print(words[i] + " ");
//            }
//        }


    }
}

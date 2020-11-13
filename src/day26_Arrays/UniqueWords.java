package day26_Arrays;
/*
5. print the unique words from an array of String
            String[] words = {"C#", "Java", "C#", "Python", "Python", "Ruby", "Swift", "C++", "Swift"}
            output:
                Java Ruby C++

 */
public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {"C#", "Java", "C#", "Python", "Python", "Ruby",
                "Swift", "C++", "Swift"};
            String result = "";
        for(int j = 0; j<= words.length-1; j++){
            int count = 0;
            String eachWord = words[j];
            for(int i = 0; i<= words.length-1;i++ ){
                if(words[i]==eachWord){
                    count++;
                }
            }
                if(count==1){
                    result+= eachWord+" ";
                }

        }
        System.out.println("Unique words are: " + result);









    }
}

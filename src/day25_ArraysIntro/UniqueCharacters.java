package day25_ArraysIntro;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "abcabaabe";

        String result = "";// ce

        for(int j = 0; j< str.length(); j++){
            char ch = str.charAt(j);// each char in string
            int count = 0;//for the frequency of ch

            for(int i = 0; i < str.length(); i++){// represents the index of str
                char eachChar = str.charAt(i);// represents each character of str
                if(eachChar==ch){
                    count++;
                }
            }

            if(count==1){//if the frequency is one, it means it is unique
                result+= ch;
            }
        }
        System.out.println(result);





    }
}

package Office_Hours.Practice_10_28_20;

public class FrequencyOfCharacter2 {
    public static void main(String[] args) {

        String str = "abababaaaaaaaaaaaaa";
        //"bababa"
        //"bbaba"
        // "bbba"
        // "bbb"
        String ch = "a";

        int count = 0;

        while( str.contains( ch ) ){
            str = str.replaceFirst(ch , "");
            count++;
        }

        System.out.println(count);



    }
}

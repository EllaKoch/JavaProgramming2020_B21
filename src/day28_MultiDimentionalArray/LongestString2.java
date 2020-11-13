package day28_MultiDimentionalArray;

public class LongestString2 {
    public static void main(String[] args) {

        String[] names = {"Elenora", "Evelyna", "Apple", "Pear", "Vale", "Jair", "Ruslana"};

        int maxLength = names[0].length();
        int minLength = names[0].length();

        for (String each: names) {// what is the max  and min length
            if(each.length() > maxLength){
                maxLength = each.length();
            }

            if(each.length()< minLength){
                minLength = each.length();
            }
        }
        System.out.println(maxLength);
        System.out.println(minLength);
        //which strings have the maximum length and min length

        String longest = "";
        String shortest = "";

        for(String each: names){
            if(each.length()==maxLength){
                longest += each+" ";

            }
            if(each.length()==minLength){
                    shortest+= each+" ";
            }
        }
        System.out.println("shortest = " + shortest);
        System.out.println("longest = " + longest );


    }
}

package Office_Hours.Practice_12_02_2020;

import java.util.ArrayList;

public class Test {
    public static String search(ArrayList<String> r, String find)
    {
        String result = "";
        for(int i = 0; i <=r.size()-1; i++){
            if(r.get(i).contains(find)){
                result+=r.get(i);
            }
        }
        if(result.isEmpty()){
            result+="search failed";
        }
        return result;
    }//end wineSeller

    public static void main(String[] args)
    {

        ArrayList<String>  arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr,"ops");
        System.out.print(find_tst);//foo bar


    }//end main
}

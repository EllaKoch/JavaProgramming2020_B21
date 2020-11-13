package day27_ForEachLoop;

public class Print3CharsOfNameArray {
    public static void main(String[] args) {
        String[] names = {"Ella", "Milan", "Miray", "Aliya", "Omid", "Vida", "Ana", "Agalar", "Ayder", "Alex"};

        for (String each:  names) {
            each = each.substring(0,3);
            System.out.println(each);
        }



    }
}

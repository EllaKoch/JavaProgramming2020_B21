package Office_Hours.Practice_11_04_2020;

public class SliceNumbers2 {
    public static void main(String[] args) {
        int num = 3456789;
        String numbers = num+"";

        for(int i = 0, j = 1; i<numbers.length(); i++, j++){
            System.out.println("digit " + j + " : " + numbers.charAt(i));
        }

    }
}

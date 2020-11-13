package day11_MultiBranchIf;

public class MaxMin1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20000;

        int max1 = 0;
// if solution

        if (a>b){
            max1 = a;
        }else{
            max1 = b;
        }
        System.out.println("Maximum number in If is: " + max1);


// ternary solution

        int max2 = (a>b) ? a : b;
        System.out.println("Maximum number in Ternary is: " + max2);

        System.out.println("============================");

        int min1 = 0;
        // if statement solution

        if (a<b){
            min1 = a;
        }else{
            min1 = b;
        }
        System.out.println("Minimum number in If is: " + min1);

        // ternary solution:
        int min2 = 0;

        min2 = (a < b) ? a : b;

        System.out.println("Minimum number in Ternary is: " + min2);




    }
}

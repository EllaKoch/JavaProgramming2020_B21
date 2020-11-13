package day11_MultiBranchIf;

public class MaxMin2 {
    public static void main(String[] args) {
        int n1 = 10000;
        int n2 = 200;
        int n3 = 30;

        int max1 = 0;

        if (n1 > n2 && n1 > n3){
            max1 = n1;
        }else if (n2 > n1 && n2 > n3){
            max1 = n2;
        }else{// if n1 & n2 are the maximum, then n3 is max
            max1 = n3;
        }
        System.out.println("Maximum number in If is: " + max1);

        //ternary way

        int max2 = 0;

        max2 = (n1 > n2 && n1 > n3) ? n1 : (n2 > n1 && n2 > n3)? n2 : n3;

        System.out.println("Maximum number in Ternary way is : " + max2);

        System.out.println("================================");
        //if way
        int min1 = 0;

        if (n1<n2 && n1< n3){
            min1 = n1;
        }else if (n2 < n1 && n2 < n3){
            min1 = n2;
        }else{
            min1 = n3;
        }
        System.out.println("Minimum number in If way is: " + min1);

        // ternary way:

        int min2 = (n1<n2 && n1< n3) ? n1 : (n2 < n1 && n2 < n3) ? n2 : n3;

        System.out.println("Minimum number in Ternary way is: " + min2);


    }
}

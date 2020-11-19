package day26_Arrays;

public class Test {
    public static void main(String[] args) {
        int a = 0;
        while(a<=6){// 2 4 6 8
            a = a+2;//here is addition not printing numbers inside loop

        }
        System.out.print(a+" ");

        System.out.println();
        System.out.println("====================");

        int i = 0;

        for(i = 0; i < 6; i+=2){// 0 2 4  if i was i<=6 than output would be 0 2 4 6
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("===============================");

        for(int j= 0; j<=4; ){
            j++;
            System.out.print(j+" ");
        }

        System.out.println();

        for(int k = 0; k<=4; k++ )
        System.out.print(k+" ");


        System.out.println();
        // print the next 3 numbers
        int n = 5;
        for(int l = n+1; l<=n+3;l++ ){
            System.out.print(l+" ");
        }

        System.out.println();

        for (int k = 0; k < 5; k++) {
            for (int j = 0; j < 5; j++) {
                if (k == 0 || k == 4) {
                    System.out.print("*");
                } else if (j == 0 || j == 4) {
                    System.out.print("@");//when index is 1 2 3 it prints "&";
                } else {
                    System.out.print("&");
                }
            }
            System.out.println();
        }



}
}

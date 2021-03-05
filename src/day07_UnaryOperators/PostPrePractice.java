package day07_UnaryOperators;

public class PostPrePractice {
    public static void main(String[] args) {
        int a = 1; // -3
        int b = -a-- + a-- / -a-- * --a;
        // b = -1 + 0 / 1 * -3
        // b = -1 + 0 * -3
        // b = -1 + 0
        // b = -1
        System.out.println("b = " + b);
        System.out.println("a = " + a);

//        int a = 1;// -1
//        int b = -a-- + a++ / -a-- * --a;
//        //b = -1 + 0 / -1 * -1
//        //b = -1 + 0 / 1
//        //b = -1 + 0 = -1
//        System.out.println("b = "+b);//-1
//        System.out.println("a = "+a);//-1

//        int a = 50; // 50
//        a = --a + a++ + a-- + a++;
//        // a = 49 + 49 + 50 + 49
//        // a = 197
//        System.out.println(a);

//        int x = 4; //5
//        int y = x * 4 -x++;
//        // y = 4 * 4 -4
//        System.out.println(y);
    }
}

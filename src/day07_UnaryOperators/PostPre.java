package day07_UnaryOperators;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PostPre {
    public static void main(String[] args) {

        int x = 2;
        int y = x++;//2  = post increment: pass current value
        System.out.println(x);//3
        System.out.println(y);//2

        System.out.println("============================");

        int x2 = 2;
        System.out.println(x2++);//2
        System.out.println(x2);//3

        System.out.println("============================");
        int x3 = 2;
        System.out.println(--x3);//1

        System.out.println("============================");
        int x4 = 8;
        int y4 = x4--;//y4 = 8

        System.out.println(y4);
        System.out.println(x4);//7

        System.out.println("==========================");

        int a = 1;//-3
        int b = -a-- + a-- / -a-- * --a;
        //b = -1 +   0  /  -1   * -1
        //b  =-1 + 0 * 1
        //b = -1 + 0 = -1
        System.out.println("b = "+b);//-1
        System.out.println("a = "+a);//-3


        System.out.println("====================");

        int A = 50;//50
        int B = --A + A++ + A-- + A++;
        // B= 49 + 49 + 50 + 49
        //B = 98 + 50 + 49
        //B = 148 + 49
        //B = 197;
        System.out.println(B);
        System.out.println("======================");

        int X = 4;//5
        int Y = X * 4 - X++;
          //Y = 16 - 4
          //Y = 12
        System.out.println(Y + " " + X);

        System.out.println("=======================");

        int t = 100;//100
        int p = - ++t * -t-- / t++ + --t;
        //p =  - 101 * -101 / 100 + 100
        //p = 10201 / 100 + 100
        //p = 102 + 100
        //p = 202
        System.out.println(p);


        System.out.println("=====================");

        int R = 20;//18
        int W = -R-- + -R++ + --R * R-- % 2;
        //  W  =  -20  + -19 + 19   * 19 % 2
        //  W   =  -20 + -19 + 361 % 2
        //  W   =  -20 + -19 + 1
        //  W   =  -39 + 1
        //  W   =  -38
        System.out.println("W = " + W + "\nR = " + R);

        System.out.println("=============================");

        int M = 300;//300
        int N = 400;//400

        int U = ++M + N++ - M-- % 2 + --N % 2;
        // U = 301 + 400 - 301 % 2 + 400%2
        // U =301 + 400 - 1 +0
        //U = 700
        System.out.println("U: "+U);



        int J = M + N - M * N + M / N;
        // J =  300 + 400 - 300 * 400 + 300 / 400
        //J   = 300 + 400 - 120000
        //J = -119300
        System.out.println(J);






    }
}
/*

 */

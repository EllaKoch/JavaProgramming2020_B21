package day20_ForLoop;

/*

 Write a program that will print out all letters in English alphabet in backwards


. Write a program that will print out all letters in English alphabet in ascending order

 */
public class LoopABC {
    public static void main(String[] args) {

        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");//ascending abc from Ascii table for corresponding charcters
        }

        System.out.println();

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("hello");

        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();//for next line

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // reverse alphabet


        for (char i = 'Z'; i >= 'A'; i--) {//same as below
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 90; i >= 65; i--) {//same as above
            System.out.print((char) i + " ");
        }

        System.out.println();
        for (int i = 122; i >= 97; i--) {//same as below
            System.out.print((char) i + " ");
        }
        System.out.println();

        for (int i = 'a'; i >= 'z'; i--) {// same as above
            System.out.print( i + " ");
        }
        System.out.println();
        System.out.println("=====================================");

        for (int abc = 122; abc >= 97; abc--) {
            System.out.print((char)abc + " ");
        }
        System.out.println();
        for (char abc = 'a'; abc <= 'z'; abc++) {
            System.out.print(abc + " ");
        }

    }

}
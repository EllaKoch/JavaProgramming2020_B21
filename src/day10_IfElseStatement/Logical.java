package day10_IfElseStatement;
// logical operators: ||, &&, !
public class Logical {
    public static void main(String[] args){

        //  ||: returns false if all expressions are false,

        boolean r1 = 10 < 9 || 20 != 20;
                //   false      false  ==> false
        System.out.println(r1);

        boolean r2 = "Muhtar" == "Good Guy" || "Muhtar" != "Bad guy";
        //                  false                   true
        // ==> true
        System.out.println(r2); // true

        boolean r3 = 'a' != 'A' || 'B' == 'B';
        //              true         true
        // true
        System.out.println(r3);

        // &&:  returns true only if all the conditions are true
        // 75% returns false

        boolean r4 = 200 > 100 && 200 < 300;
                    //  true    &&  true
        System.out.println(r4);// true

        boolean r5 = true && false;// false
        System.out.println(r5);//false


        // !:  returns the opposite of the boolean

        System.out.println(!true);// false

        System.out.println(!false);// true











    }
}

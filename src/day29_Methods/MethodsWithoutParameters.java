package day29_Methods;
/*

        step1: print hello 5 times  (for loop)
        step2: print your name
        step3: print hello 5 times  (for loop)
        step4: print your school name
        step5: print hello 5 times   (for loop)
 */
public class MethodsWithoutParameters {

    public static void main(String[] args) {
    printHello5Times();
        System.out.println("Elvira");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();

    }

    //AccessModifier  specifier   returnTYPE   MethodName (Parameter){
    //                        statements
    //            }

    public static void printHello5Times(){
        for(int i = 1; i <6; i++){
            System.out.println("Hello");
        }
    }




}

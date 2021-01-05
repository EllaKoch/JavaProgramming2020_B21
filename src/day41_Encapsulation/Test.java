package day41_Encapsulation;

import day43_Inheritance.AccessModifiers;

public class Test  extends AccessModifiers {
    public static void main(String[] args) {
        System.out.println(Data.publicVariable);
        //    System.out.println(Data.privateVariable);
        System.out.println(Data.defaultVariable);

        Data obj = new Data();

        Data.publicMethod();
        //  Data.privateMethod();
        Data.defaultMethod();

        Test.publicMethod();
        Test.protectedMethod();
        //Test.defaultMethod;

    }



}


class Test2{

}

class Test3{

}

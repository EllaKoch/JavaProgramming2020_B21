package day48_Abstraction;

public interface InterfaceRules {
    // variables in interface cannot be reinitialized
    int a = 100;// PUBLIC, STATIC, FINAL  by default

    public  default void m(){// default method (won't use it in selenium)

    }

    void method2();//abstract methods



    /*
    PURPOSE OF INTERFACE: TO REACH ABSTRACTION

   Interface can have: variables only -> PUBLIC, STATIC, FINAL  by default
                        static methods
                        abstract methods
                        default method (won't use it in selenium)

    Interface CANNOT HAVE: OBJECTS
                           CONSTRUCTOR
                           INSTANCE METHODS
                           INSTANCE variables




     */



}


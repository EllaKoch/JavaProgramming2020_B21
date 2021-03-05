package day48_Abstraction;

import day48_Abstraction.AnimalTask.Animal;
import day48_Abstraction.AnimalTask.Shark;

public interface InterfaceRules {
    Shark s = new Shark("sd","hjshf", "esdkfhk",'d', 4);

    // variables in interface cannot be reinitialized
  public static final   int a = 100;// PUBLIC, STATIC, FINAL  by default

    public default void m(){// default method (won't use it in selenium)

    }

    public static void method1(){

    }
    public abstract void method2();//abstract methods




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


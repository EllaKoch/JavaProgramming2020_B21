package day50_Polymorphism.InterfacePractice;

public interface Test {

    public static void method1(){
        System.out.println("Static Method");
    }

   // void method2(){ abstract method cannot be implemented
      //  System.out.println("Instance method");
   // }

    public abstract void method3();

    public void method4();

}
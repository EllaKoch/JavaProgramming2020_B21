package day44_Inheritance;

class Q{

    public final void method(){// final method cannot be overriden but only overloaded
        System.out.println("method A");
    }

    public final void method(int a ){
        System.out.println("method A is overloaded");
    }

}

public class FinalKeyword extends Q{

   // public void method(){  cannot override the final method, because it is constant
   //     System.out.println("Method B");
  //  }


    public final static int z = 200;
}

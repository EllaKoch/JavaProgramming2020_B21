package day40_Constructor;
// ClassName  objectName  =  new constructor;
// Without constructor there is no class
// Constructor is mandatory in every class
// If you don't create constructor byYourself compiler will create one for you which is a "default constructor" without parameter or argument
// Constructor name  must match the class name
// Constructor declaration is:  Access Modifier  className(with or without arg)
// Constructor will be executed whenever there is an object, (# of executions == # of objects)
// Static variables are highly recommended to be initialized outside the constructor for higher efficiency and faster processing
//If static variables happen to be initialized inside constructor and we have created 5 objects ==> then variable assignment will happen 5 times
public class ConstructorIntro {

    public ConstructorIntro(int a){
        System.out.println("Constructor with int arg");// executes only when obj is created

    }
    int a = 100;


    public static void main(String[] args) {

        System.out.println("hello");
        //System.out.println(a);

        int num = new ConstructorIntro(10).a;

        ConstructorIntro obj2 = new ConstructorIntro(100);



    }
}

package day41_Encapsulation;

public class Login {
    public static void main(String[] args) {
        Credentials obj  =new Credentials();

//        System.out.println(obj.userName);
//        obj.userName = "ABC";
//
//        System.out.println(obj.userName);


        System.out.println(obj.getUserName());

        System.out.println(obj.getPassWord());

        obj.setUserName("Hello");
        System.out.println(obj.getUserName());

        obj.setPassWord(14321);
        System.out.println(obj.getPassWord());


    }
}

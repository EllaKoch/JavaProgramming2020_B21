package day41_Encapsulation;

public class Credentials {

    private String userName = "cybertek";
   // private String password = "cybertek123";

    private double passWord = 1234;

    public String getUserName(){
        return userName;
    }

    public double getPassWord(){
        return passWord;
    }

    public void setPassWord(double passWord) {
 /*
        if(userName.length() < 8){
            return;
        }
                we can also do security check in setter of Encapsulation
         */

        this.passWord = passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }




}

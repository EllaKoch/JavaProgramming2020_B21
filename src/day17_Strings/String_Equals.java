package day17_Strings;

public class String_Equals {
    public static void main(String[] args) {

        String str = "jira";
        String str2 = new String("jira");

        System.out.println(str == str2);//false --> different location
        System.out.println(str.equals(str2));//true --> compares the value

        System.out.println(str.equals("Jira"));//false case sensitive

        System.out.println(str.equalsIgnoreCase("JIRA"));//IGNORES SENSITIVITY


    }

}

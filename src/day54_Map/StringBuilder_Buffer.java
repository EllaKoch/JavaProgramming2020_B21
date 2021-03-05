package day54_Map;

public class StringBuilder_Buffer {
    public static void main(String[] args) {

        String string = "Cybertek";//immutable
        string.concat(" School");
        StringBuilder stringBuilder = new StringBuilder("Cybertek");//mutable
        stringBuilder.append(" School");
        stringBuilder.reverse();

        System.out.println(string);
        System.out.println(stringBuilder);
        //StringBuffer was designed to be synchronized == slower
    }
}

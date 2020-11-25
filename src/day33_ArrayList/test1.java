package day33_ArrayList;

public class test1 {
    public static void main(String[] args) {
        String s = "12hello";

        String result = "";

        for(char each: s.toCharArray()){
            if(Character.isDigit(each)){
                result+=each;
            }
        }

        System.out.println(result);

        String line = "error moo";


        line = line.toLowerCase();
        if(line.startsWith("error")){
            System.out.println("true");
        }






//        int wd = 0;
//        String[] days = {"sun", "mon", "wed","sat"};
//
//        for(int i = 0; i< days.length; i++){
//            switch (days[i]){
//                case "sat":
//                case "sun":
//                    wd -=1;
//                    break;
//                case "mon":
//                    wd++;
//                case "wed":
//                    wd +=2;
//            }
//        }
//        System.out.println(wd);

    }
}

package day11_MultiBranchIf;

public class PositiveNegativeZero {
    public static void main(String[] args) {

        long num = 0;

        if (num>0 ){
            System.out.println(num+ " is positive");
        }else if (num<0){
            System.out.println(num + " is negative");
        }else{
            System.out.println(num + " is zero");
        }
    }
}

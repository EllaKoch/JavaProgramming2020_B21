package day12_NestedIf;

public class taskEqualNumber {
    public static void main(String[] args) {
        int n1 = 600, n2 = 600, n3 = 900;

        // for n1 & n2 are equal ==>boolean isEqual1 = n1 == n2 && n1 != n3
        //for n2 & n3 are equal ==> boolean isEqual2 = n2 == n3 && n2 != n1
        // for n3 & n1 are equal ==> boolean is Equal3 = n1 == n3 && n1 != n2
        // for all eqaul boolean ==> n1 ==n2 && n2 == n3
        // for none equal boolean ==> n1 != n2 && n2 != n3 && n1 != n3


        String result = " ";

        if (n1 == n2 && n2 == n3){//becomes false if none are equal
            result ="All are equal";
        }else if (n1 == n2){// if not all equal assume n1 & n2 are equal
            result = "n1 and n2 are equal";
        }else if (n2 == n3){
            result =  "n2 and n3 are equal";
        }else if (n1 == n3){
            result =  "n1 and n3 are equal";
        }else{
            result = "None of the numbers are equal";
        }
        System.out.println(result);
        // ternary way

        String result2 = (n1 == n2 && n2 == n3)? "All equal"
                :(n1 == n2)? "n1 & n2 are equal" :(n2 == n3)?"n2 & n3 are equal"
                :(n1 == n3)? "n1 & n3 are equal " : "None of the numbers are equal";

        System.out.println(result2);

    }
}

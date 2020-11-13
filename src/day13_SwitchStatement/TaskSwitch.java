package day13_SwitchStatement;

public class TaskSwitch {
    public static void main(String[] args) {
        char letter = 'B'; //for A, B, C, D, E
        String output = "";

        switch (letter){
            case 'A': output = "A";
            break;

            case 'B': output = "B";
            break;

            case 'C': output = "C";
            break;

            case 'D': output = "D";
            break;

            case 'E': output = "E";
            break;

            default:
                System.out.println("Not Found");
        }

        System.out.println(output);

    }

}
/*
Create a new switch statement using char instead of int.
Create a new char variable
Create a switch statement testing for A, B, C, D or E
Display a message if any of these are found
and then break
Add a default which displays a message saying not found.
 */
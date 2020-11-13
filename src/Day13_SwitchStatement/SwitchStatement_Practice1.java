package Day13_SwitchStatement;

public class SwitchStatement_Practice1 {
    public static void main(String[] args) {

        int n = 5;

        switch (n){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                    break;
            default:
                System.out.println("Invalid data");
                break;//not necessary to give break since its the end of switch.

        }

    }
}

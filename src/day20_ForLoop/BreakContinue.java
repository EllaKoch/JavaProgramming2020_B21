package day20_ForLoop;
import java.util.Scanner;
public class BreakContinue {
    public static void main(String[] args) {

        for(int i = 1; i <=10; i--){
            if(i < 1){
                break;// exits the loop immediately
            }
            System.out.println("Hello batch 21");
        }


        System.out.println("============================");

  /*

   */



            Scanner scan = new Scanner(System.in);

        for(int i = 0; i ==0;){

            System.out.println("Enter two numbers: ");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            System.out.println("Enter math operator");
            char op = scan.next().charAt(0);
            switch(op){
                case '+':
                    System.out.println("Sum: "+(n1+n2));
                    break;
                case '-':
                    System.out.println("Subtraction: " + (n1-n2));
                    break;
                case '*':
                    System.out.println("Multiplication: " + (n1*n2));
                    break;
                case '/':
                    System.out.println("Division: "+ (n1/n2));
                    break;
                case '%':
                    System.out.println("Remainder: " + (n1%n2));
                    break;
                default:
                    System.err.println("Invalid Operator!");
                    break;

            }
                if(op== '+'||op=='-'||op=='*'||op=='/'||op=='%'){
                    System.out.println("Would you like to continue? Yes/No");
                    String answer = scan.next();

                    if(answer.equalsIgnoreCase("no")){
                        System.out.println("Thank you for using our calculator");
                        break;
                    }

                }else{
                    break;
                }

        }

    }
}

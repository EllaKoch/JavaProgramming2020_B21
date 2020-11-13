package day16_Scanner;
import java.util.Scanner;
public class BrowserTaskSc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a browser type:");
        String browser = input.nextLine();
        input.close();

        switch(browser){

            case "chrome":
                System.out.println("Chrome is opening");//sout(browser + " is opening")
            break;
            case "firefox":
                System.out.println("Firefox is opening");
                break;
            case "opera":
                System.out.println("Opera is opening");
                break;
            case "safari":
                System.out.println("Safari is opening");
                break;
            case "internet explorer":
                System.out.println("Internet Explorer is opening");
                break;
            default:
                System.out.println(browser + " is not valid");

        }
    }
}

package day12_NestedIf;
public class BrowserTask {
    public static void main(String[] args) {
        
        String selectBrowser = "safar";

           if (selectBrowser == "opera" ||selectBrowser == "safari"
                   || selectBrowser == "chrome"||selectBrowser == "firefox" ) {

               if (selectBrowser == "opera") {
                   System.out.println("Opera Browser is selected");
               }else if (selectBrowser == "safari"){
                   System.out.println("Safari Browser is selected");
               }else if (selectBrowser == "chrome"){
                   System.out.println("Chrome browser is selected");
               }else{
                   System.out.println("Firefox Browser is selected");
               }
           }else{
               System.out.println("Invalid Browser Name");
            }
    }
}
/*
4. write a program that can display the selected browser
                1. declare a String variable called selectBrowser
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with
                   the valid browsers' names, out put should be: Invalid Browser Name
             Ex:
                selectBrowser = "chrome";
                output:
                    Chrome Browser is Selected
                selectBrowser =   "cybertek";
                output:
                    Invalid Browser Name

 */
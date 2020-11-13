package day13_SwitchStatement;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "cybertek";

        boolean valid = browserName == "chrome" || browserName =="firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge" || browserName == "ie";

        String selectedBrowser = " ";
        if (valid){
            if (browserName == "chrome"){
                selectedBrowser = "CHROME BROWSER";
            }else if(browserName == "firefox"){
                selectedBrowser = "FIREFOX BROWSER";
            }else if(browserName == "opera"){
                selectedBrowser= "OPERA BROWSER IS SELECTED";
            }else if (browserName == "edge"){
              selectedBrowser = "EDGE BROWSER IS SELECTED";
            }else{
                selectedBrowser = "INTERNET EXPLORER BROWSER";
            }

        }else{
            System.out.println("No such browser");
        }

        System.out.println(selectedBrowser);
    }
}
/*
2. write a program that can display the selected browser
                1. declear a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge, ie
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
             Ex:
                browserName = "chrome";
                output:
                    Chrome Browser is Selected
Collapse

 */
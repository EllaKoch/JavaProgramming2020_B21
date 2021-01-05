package day44_Inheritance.remoteWebDriverTask;

public class WebDriverObjects {
    public static void main(String[] args) {

        ChromeDriver chrome = new ChromeDriver();

        System.out.println(chrome);

        chrome.get("Google.com");
        chrome.maximize();
        chrome.close();
        System.out.println(chrome.version);


        FireFoxDriver  fireFox = new FireFoxDriver();

        fireFox.get("apple.com");

        CybertekDriver cybertekDriver = new CybertekDriver();

        cybertekDriver.get("tesla.com");

        cybertekDriver.maximize();
        cybertekDriver.close();



    }
}

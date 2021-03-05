package day49_Abstraction.RemoteDriverTask;



public class TestCases {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();
        driver.TakeScreenShot("pic");

        FireFoxDriver driver2 = new FireFoxDriver();
        driver2.get("https://www.google.com");
        driver2.TakeScreenShot("pic1");

        CybertekDriver driver1 = new CybertekDriver();
        driver1.executeScript("hello world");



    }


}

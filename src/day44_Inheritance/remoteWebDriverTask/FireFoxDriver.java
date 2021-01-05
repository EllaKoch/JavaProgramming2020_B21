package day44_Inheritance.remoteWebDriverTask;

public class FireFoxDriver extends WebDriver{

    public FireFoxDriver() {
        super("FireFox Browser", "v83.7.3");

    }


    public void get(String URL) {
        System.out.println("Opening " + URL + " from Firefox driver");
    }


    public void maximize() {
        super.maximize();
    }


    public void close() {
        super.close();
    }
}

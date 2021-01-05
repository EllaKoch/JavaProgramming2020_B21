package day44_Inheritance.remoteWebDriverTask;

public class CybertekDriver extends WebDriver{

    public CybertekDriver() {
        super("Cybertek Browser", "V21.1");
    }


    public void get(String URL) {
        System.out.println("Opening " + URL+ " from Cybertek driver");
    }


    public void maximize() {
        super.maximize();
    }


    public void close() {
        super.close();
    }
}

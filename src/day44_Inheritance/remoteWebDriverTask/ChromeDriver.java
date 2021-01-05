package day44_Inheritance.remoteWebDriverTask;

public class ChromeDriver  extends WebDriver {



    public ChromeDriver() {
        super("Chrome Browser", " 87.0.4280.88 (Official Build) (x86_64)");

    }


    public void get(String URL) {
        System.out.println("Opening "+ URL+ " from Chrome driver");
    }


    public void maximize() {
        System.out.println("Maximizing chrome window ");
    }


    public void close() {
        super.close();
    }
}

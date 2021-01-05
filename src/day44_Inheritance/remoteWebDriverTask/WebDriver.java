package day44_Inheritance.remoteWebDriverTask;

public class WebDriver {

    public String name, version;

    public WebDriver(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void get(){
        System.out.println("Opening default driver");
    }

    public void maximize(){
        System.out.println("Maximizing window of " + name);
    }

    public void close(){
        System.out.println("Closing " + name);
    }


    public String toString() {
        return "WebDriver{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}

package day49_Abstraction.RemoteDriverTask;

public class CybertekDriver extends RemoteDriver{
    @Override
    public void executeScript(String script) {
        System.out.println("Script " + script + " is executed on Cybertek");
    }

    @Override
    public void TakeScreenShot(String name) {
        System.out.println("Taking screenShot on Cybertek");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to " + URL+ " on Cybertek");
    }

    @Override
    public void close() {
        System.out.println("Closing Cybertek browser");
    }

    @Override
    public void quit() {
        System.out.println("Quiting Cybertek browser");
    }
}

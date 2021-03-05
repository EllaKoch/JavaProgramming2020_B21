package day49_Abstraction.RemoteDriverTask;

public interface WebDriver {

    public abstract void get(String URL);

    void close();

    void quit();

}

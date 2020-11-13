package day13_SwitchStatement;

public class SwitchStetement_practice3 {
    public static void main(String[] args) {
        String selectBrowser = "safari";
        String output = "";

        switch (selectBrowser){
            case "chrome": output = "CHROME BROWSER IS SELECTED";
                break;
            case "safari": output = "SAFARI BROWSER IS SELECTED";
                break;
            case "ie": output = "INTERNET EXPLORER BROWSER IS SELECTED";
                break;
            case "firefox": output = "FIREFOX BROWSER IS SELECTED";
                break;
            case "opera": output = "OPERA BROWSER IS SELECTED";
                break;
            case "edge": output = "EDGE BROWSER IS SELECTED";
                break;
            default: output = "WRONG BROWSER INPUT";
        }

        System.out.println(output);

    }
}

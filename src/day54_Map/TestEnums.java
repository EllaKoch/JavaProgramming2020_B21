package day54_Map;

public class TestEnums {

    public static void main(String[] args) {
        //enum = enumerated datatype
        String browserName = "Cybertek";

        Browsers browserName2 = Browsers.Chrome;//cannot assign anything but what is in enum


        switch (browserName2) {
            case Chrome:
                System.out.println("Chrome is selected");
                break;
            case Safari:
                System.out.println("Safari is selected");
                break;
            default:
                System.out.println("FireFox is selected");
        }

        DaysInAWeek day = DaysInAWeek.Mon;

        ComputerOs os = ComputerOs.MacOs;

        Priority priority = Priority.High;





    }
}

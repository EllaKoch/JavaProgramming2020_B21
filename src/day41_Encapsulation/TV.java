package day41_Encapsulation;

public class TV {


    private int channel = 1;
    private int volumeLevel = 1;
    private boolean on = false;
    private String brand = "undefined";



    public TV() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {

        this.channel = channel;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void channelUp() {
        if (on && channel < 1 || channel > 120) {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        } else {
            channel++;
        }

    }

    public void channelDown() {
        if (on || channel <= 1 || channel > 120) {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        } else {
            channel--;
        }
    }

    public void volumeUp() {
        if (on && volumeLevel <1 || volumeLevel > 7) {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        } else {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if (on && volumeLevel <= 7 || volumeLevel >= 1) {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        } else {
            volumeLevel--;
        }
    }

    public void isOn() {

    }


    public void turnOn() {
        if (!on) {
            System.out.println("TV is already ON");
        }
    }

    public void turnOff() {
        if (on) {
            System.out.println("TV is already OFF");
        }

    }


    public static class TVObject {

        public static void main(String[] args) {

            TV o1 = new TV();

            o1.turnOff();
            o1.turnOn();


            o1.channelDown();
           // o1.channelUp();
            //o1.channelUp();
            o1.channelDown();

           // o1.channelDown();
           // o1.channelDown();
            System.out.println(o1.channel);


            //o1.volumeUp();
            o1.volumeUp();
            //o1.volumeDown();
            //o1.volumeDown();
            //o1.volumeDown();
            System.out.println(o1.volumeLevel);
            o1.turnOff();


        }


    }


}

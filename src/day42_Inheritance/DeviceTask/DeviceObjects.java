package day42_Inheritance.DeviceTask;

public class DeviceObjects {
    public static void main(String[] args) {

        TV tv = new TV("Samsung", "Lx32", 499.99);

        System.out.println(tv);
        tv.channelDown();
        tv.channelUp();
        tv.turnOff();
        tv.turnOn();

        Phone phone = new Phone("iPhone", "12 pro Max", 1200);

        System.out.println(phone);

        phone.call(347825521);

        phone.text(347825521);

        phone.turnOff();

        System.out.println(TV.hasBattery);



    }
}

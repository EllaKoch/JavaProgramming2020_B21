package day45_Exceptions.phoneTask;

public class Walmart {
    public static void main(String[] args) {
        long number = 911;
        Iphone iphone = new Iphone("12 Pro Max", 1300);
        Samsung samsung = new Samsung("S20", 1200);
        Nokia nokia = new Nokia("Brick", 70);
        HuaWei huaWei = new HuaWei("iSpy", 300);

        iphone.call(number);
        samsung.call(number);
        nokia.call(number);
        huaWei.call(number);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);
        System.out.println(huaWei);



        iphone.faceTime(12345);
        samsung.freeze();
        nokia.breakTheFloor();
        nokia.selfDefence();

        huaWei.spy();


    }
}

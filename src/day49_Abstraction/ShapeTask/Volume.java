package day49_Abstraction.ShapeTask;

public interface Volume {

    boolean hasVolume = true;// public static final by default

    double volume();//public abstract by default


    public static void main(String[] args) {
        System.out.println(hasVolume);
        System.out.println(Volume.hasVolume);

       // hasVolume = false;// cannot reassign since it is final
    }
}

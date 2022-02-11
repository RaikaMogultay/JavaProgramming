package day45_Interface.shape;

public interface Volume {

    boolean hasVolume = true;

    double volume();

    default void print(){
        System.out.println(" the volume is ");
    }
}

@FunctionalInterface
public interface FunctionalInterfaceInJava8 {
    public void sayHi();
    default void sayHello(){
        System.out.println("from default function");
    }
    public static void sayBy(){
        System.out.println("from static function");
    }
}

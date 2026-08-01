package SingeltonClass;

public class Main {
    public static void main(String[] args) {

        // all 3 objects created are pointing to same reference
        SingletonEg obj = SingletonEg.getInstance();
        SingletonEg obj1 = SingletonEg.getInstance();
        SingletonEg obj2 = SingletonEg.getInstance();

        System.out.println(obj + "\n" + obj1 + "\n" + obj2);
        /*output - SingeltonClass.SingletonEg@8efb846
                   SingeltonClass.SingletonEg@8efb846
                   SingeltonClass.SingletonEg@8efb846
         */
    }
}

import packages.Greetings;// import packages (user defined)
import java.util.Random;// in build
public class packageExample {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100);
        System.out.println(n);//output - random number

        Greetings.greet(); //output - hello from packages
    }
}

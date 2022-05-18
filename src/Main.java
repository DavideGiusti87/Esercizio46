import java.util.concurrent.TimeUnit;

/*
While Loop 01
Exercise: While Loop 1
print on screen infinite times I am in loop every 1 second
use sleep() method from java.util.concurrent.TimeUnit to count 1 second
place the sleep() method inside this statement: try { /* place here sleep()  *\ } catch (InterruptedException e) { }
stop the execution (from command line you can use CTRL + C, from IntelliJ IDEA you can press the red square button)
 */
public class Main {
    public static void main(String[] args) {

        TimeUnit timeUnit = TimeUnit.SECONDS;

        while (true){

            System.out.println("I am in loop");

            try {
                timeUnit.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

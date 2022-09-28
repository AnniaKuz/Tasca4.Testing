import java.io.IOException;
import java.util.ArrayList;

/**
 * Create a class with a method that throws ArrayIndexOutOfBoundsException.
 * Verity that it works correctly
 */

public class Main {
    static int [] numbers = new int[3];

    public static void main(String[] args) {

        System.out.println("JUnit test : ArrayIndexOutOfBoundsException");
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        throwsException();
    }
    public static void throwsException(){
        try{
            numbers[3] = 3;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

}

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @autor Created by mariavasilenko on 12/3/18.
 */
public class Homework2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] myArray = new int[10];
        for (int i=0;i < myArray.length; i++) {
            System.out.println("Enter numbers for array");
            try {
                myArray[i] = s.nextInt();

            } catch (InputMismatchException e) {
                s.next();
                System.out.println("Array should contain only numbers");
            }
        }
        System.out.println("Reverted array");
        for (int i = myArray.length-1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }

    }

}


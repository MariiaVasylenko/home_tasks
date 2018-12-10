import java.util.ArrayList;
import java.util.Scanner;

/**
 * @autor Created by mariavasilenko on 12/3/18.
 */
public class Homework3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] myArray = new int[20];
        int i = 0;
        int pairCount = 0;
        while (i < myArray.length) {
            myArray[i] = getInt(s);
            if (myArray[i] % 2 == 0) pairCount++;
            i++;
        }
        int[] pairArray = new int[pairCount];
        int[] unPairArray = new int[myArray.length - pairCount];
        i = 0;
        int pairIndex = 0;
        int unpairIndex = 0;
        while (i < myArray.length) {
            if (myArray[i] % 2 == 0) {
                pairArray[pairIndex] = myArray[i];
                pairIndex++;
            } else {
                unPairArray[unpairIndex] = myArray[i];
                unpairIndex++;
            }
            i++;
        }
        System.out.println("pair");
        i = 0;
        while (i < pairArray.length) {
            System.out.println(pairArray[i]);
            i++;
        }
        System.out.println("unpair");
        i = 0;
        while (i < unPairArray.length) {
            System.out.println(unPairArray[i]);
            i++;
        }

    }

    private static int getInt(Scanner sc) {
        try {
            System.out.println("input int for array");
            String string2 = sc.nextLine();
            return Integer.parseInt(string2);
        } catch (NumberFormatException e) {
            return getInt(sc);
        }
    }

}

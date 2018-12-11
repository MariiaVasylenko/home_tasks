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
        for (i=0; i < myArray.length; i++) {
            myArray[i] = getInt(s);
            if (myArray[i] % 2 == 0) pairCount++;
        }
        int[] pairArray = new int[pairCount];
        int[] unPairArray = new int[myArray.length - pairCount];
        int pairIndex = 0;
        int unpairIndex = 0;
        for ( i = 0;i < myArray.length;i++) {
            if (myArray[i] % 2 == 0) {
                pairArray[pairIndex] = myArray[i];
                pairIndex++;
            } else {
                unPairArray[unpairIndex] = myArray[i];
                unpairIndex++;
            }

        }
        System.out.println("pair");

        for (i = 0;i < pairArray.length; i++) {
            System.out.println(pairArray[i]);

        }
        System.out.println("unpair");

        for (i = 0; i < unPairArray.length; i++) {
            System.out.println(unPairArray[i]);
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

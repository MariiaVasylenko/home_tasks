import java.util.Scanner;

/**
 * @autor Created by mariavasilenko on 12/3/18.
 */
public class Homework1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("My name is " + getName(s) + " and I  " + getAge(s) + " years old");
    }

    private static int getAge(Scanner sc) {
        try {
            System.out.println("Enter your age");
            String string2 = sc.nextLine();
            return Integer.parseInt(string2);
        } catch (NumberFormatException e) {
            System.out.println("Age should contain only letters");
            return getAge(sc);
        }
    }

    private static String getName(Scanner scanner) {
        try {
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            if (!name.matches("[a-zA-Z]+")) {
                throw new IsNotNameException();
            }
            return name;
        } catch (IsNotNameException e) {
            System.out.println(e.getMessage());
            return getName(scanner);

        }
    }

    static class IsNotNameException extends Exception {

        public IsNotNameException() {
            super("Name should contains only letters");
        }
    }

}


import java.util.Scanner;

/**
 * This is the standard Main() class starting point.
 *
 * @author  Michael Clermont
 * @version 1.0
 * @since   2020-10-04
 */

final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // use Stack class
        final Stack someStack = new Stack();
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        final int stackNumber = sc.nextInt();
        someStack.push(stackNumber);
        System.out.println("The stack before the pop is: "
                          + someStack.getStack());

        someStack.pop();
        System.out.println("The stack after the pop is: "
                          + someStack.getStack());

        System.out.println("\nDone.");
    }
}


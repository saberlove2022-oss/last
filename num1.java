
/**
 * Write a description of class nene here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

   import java.util.*;
public class num1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        for (;;) { 
            System.out.print("Please enter a number between 1 and 100: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 1 && number <= 100) {
                    System.out.println("You entered a valid number: " + number);
                    break;
                } else {
                    System.out.println("Invalid input. The number must be between 1 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
    }
}

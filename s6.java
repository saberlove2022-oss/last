import java.util.Scanner;

/**
 * Write a description of class s6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class s6
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = {3, 4, 7, 10, 9};
int sum = 0, count = 0;

for (int n : arr) {
    if (n % 2 != 0) {
        sum += n;
        count++;
    }
}
  System.out.println("Sum of odd numbers = " + sum);
System.out.println("Count of odd numbers = " + count);
  }
}
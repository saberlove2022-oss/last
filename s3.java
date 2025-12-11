import java.util.Scanner;

/**
 * Write a description of class s3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class s3
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
    }
}
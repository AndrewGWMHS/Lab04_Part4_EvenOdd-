import java.util.Scanner;
public class EvenOrOddDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber;

        System.out.println("Enter an integer:");
        userNumber = scan.nextInt();

        if (userNumber%2 == 0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
}
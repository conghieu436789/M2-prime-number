import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner Scanner = new Scanner(System.in);
        int number = Scanner.nextInt();
        boolean checkPrime = true;
        if (number <2) {
            checkPrime = false;
        } else {
            for (int i = 2; i<=Math.sqrt(number); i++) {
                if (number % i == 0) {
                    checkPrime = false;
                    break;
                }
            }
        }
        if (checkPrime) {
            System.out.printf("%d is a prime",number);
        } else {
            System.out.printf("%d is not a prime", number);
        }
    }
}

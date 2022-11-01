import java.util.Scanner;
//import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        int secretNumber = 50;

        System.out.println("Secret number is " + secretNumber);

        Scanner keyboard = new Scanner(System.in);

        int guess = 100;

        System.out.print("Enter a guess: ");

        guess = keyboard.nextInt();

        if (guess == secretNumber)
            System.out.println("your guess is correct.Congratulations");
        else if (guess < secretNumber)
            System.out.println("your guess is Too small");
        else if (guess > secretNumber)
            System.out.println("your guess is Too Large");
    }
}


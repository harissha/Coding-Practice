package introduction_challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WelcomeToJava {
    /*
    Welcome to the world of Java! In this challenge, we practice printing to stdout.

    The code stubs in your editor declare a Solution class and a main method. Complete the main method by copying the two lines of code below and pasting them inside the body of your main method.

    System.out.println("Hello, World.");
    System.out.println("Hello, Java.");

    Input Format

    There is no input for this challenge.

    Output Format

    You must print two lines of output:

        Print Hello, World. on the first line.
        Print Hello, Java. on the second line.

    Sample Output

    Hello, World.
    Hello, Java.
     */


    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */

        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");

        /*
        // using InputStreamReader
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Input : ");
            String statement = reader.readLine();
            System.out.println(statement);
            String statement1 = reader.readLine();
            System.out.println(statement1);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }*/

        /*
        // using Scanner
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input : ");
            String statement = scanner.nextLine();
            System.out.println(statement);
            String statement1 = scanner.nextLine();
            System.out.println(statement1);
            */

    }


}

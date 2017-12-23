package introduction_challenges;

import java.util.Scanner;

public class JavaOutputFormatting {

    /*
    Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

    To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

    Input Format

    Every line of input will contain a String followed by an integer.
    Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from to 999.

    Output Format

    In each line of output there should be two columns:
    The first column contains the String and is left justified using exactly 15 characters.
    The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

    Sample Input

    java 100
    cpp 65
    python 50

    Sample Output

    ================================
    java           100
    cpp            065
    python         050
    ================================

    Explanation

    Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is the 16th character, and each integer that was less than 3 digits now has leading zeroes.
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            /* String s = String.valueOf(x);
            for(int j=0; j<s.length();j++){
                if(s.length()<3){
                    s= "0"+s;
                }
            }
            System.out.printf("%-15s%3s\n",s1,s); */

            System.out.printf("%-15s%03d\n",s1,x);

            /*
            When we need to display data in the form of a table, the task might become cumbersome
            if we manually insert the appropriate number of spaces to align the rows properly.
            For this purpose, we can use the formatting capabilities provided by this method.
            The length of the area in which the text is to be printed is known as the field width.
            We can specify the field width by inserting a number between the % sign and the conversion character.
            If the data to be printed is smaller, then the appropriate number of spaces are inserted and the data is right justified.
            To left justify the data, we place a negative sign before the number. Field width can be specified for printing any data type.
             */
        }
        System.out.println("================================");

    }
}

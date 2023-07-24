/*
When provided with a number between 0-9, return it in words.
Input: 1
Output: "One".
 */
package codewars;

import java.util.Random;

public class SwitchUp {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(8);
        System.out.print("numero: " + number);
        System.out.println("");

        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }

    }
}

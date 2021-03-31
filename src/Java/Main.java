package Java;

import java.util.Scanner;

public class Main {

        /* 2. Write a Java method to compute the average of three numbers. Go to the editor
    Test Data:
    Input the first number: 25
    Input the second number: 45
    Input the third number: 65
    Expected Output:

    The average value is 45.0 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Geef het eerste getal op: ");
        int numberOne = input.nextInt();

        System.out.println("Geef het tweede getal op: ");
        int numberTwo = input.nextInt();

        System.out.println("Geef het derde getal op: ");
        int numberThree = input.nextInt();

        average(numberOne, numberTwo, numberThree);

    }

    public static void average (int numberOneEx, int numberTwoEx, int numberThreeEx) {
        System.out.println("Het gemiddelde is: " + (numberOneEx + numberTwoEx + numberThreeEx) / 3);
    }
}

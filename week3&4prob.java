

import java.util.Scanner;

public class ControlFlowPracticeProgram {

    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        // -------------------------------
        // LEVEL 1 - Problem 1: Even or Odd
        // -------------------------------

        // Variable declaration for number
        int number;
        boolean isEven;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Boolean expression to check even
        isEven = (number % 2 == 0);

        // if-else condition
        if (isEven) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }

        // -------------------------------
        // LEVEL 1 - Problem 2: Greatest of Three Numbers
        // -------------------------------

        // Variable declaration
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int greatestNumber;

        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();

        System.out.print("Enter third number: ");
        thirdNumber = input.nextInt();

        // Using if-else if ladder
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            greatestNumber = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            greatestNumber = secondNumber;
        } else {
            greatestNumber = thirdNumber;
        }

        System.out.println("Greatest number is: " + greatestNumber);

        // -------------------------------
        // LEVEL 1 - Problem 3: Multiplication Table using for loop
        // -------------------------------

        int tableNumber;
        int limit;
        int result;

        System.out.print("Enter number to print table: ");
        tableNumber = input.nextInt();

        System.out.print("Enter limit: ");
        limit = input.nextInt();

        // for loop
        for (int i = 1; i <= limit; i++) {
            result = tableNumber * i;
            System.out.println(tableNumber + " x " + i + " = " + result);
        }

        // -------------------------------
        // LEVEL 2 - Problem 1: Sum of numbers using while loop
        // -------------------------------

        int count;
        int sum = 0;
        int currentNumber = 1;

        System.out.print("Enter count of numbers to sum: ");
        count = input.nextInt();

        // while loop
        while (currentNumber <= count) {
            sum = sum + currentNumber;
            currentNumber++;
        }

        System.out.println("Sum is: " + sum);

        // -------------------------------
        // LEVEL 2 - Problem 2: Break and Continue Example
        // -------------------------------

        int breakLimit;

        System.out.print("Enter break limit: ");
        breakLimit = input.nextInt();

        for (int i = 1; i <= 10; i++) {

            // continue example (skip even numbers)
            if (i % 2 == 0) {
                continue;
            }

            // break example
            if (i > breakLimit) {
                break;
            }

            System.out.println("Number: " + i);
        }

        // -------------------------------
        // LEVEL 3 - Problem 1: Grade Calculator using switch
        // -------------------------------

        int marks;
        char grade;

        System.out.print("Enter marks (0-100): ");
        marks = input.nextInt();

        // if-else to determine grade
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // switch statement
        switch (grade) {
            case 'A':
                System.out.println("Grade A - Excellent");
                break;
            case 'B':
                System.out.println("Grade B - Very Good");
                break;
            case 'C':
                System.out.println("Grade C - Good");
                break;
            case 'D':
                System.out.println("Grade D - Pass");
                break;
            case 'F':
                System.out.println("Grade F - Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }

        // Closing scanner
        input.close();
    }
}
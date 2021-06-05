/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.util.Scanner;

public class ComparingNums
{
    public static void main(String[] args)
    {
        System.out.print("Enter the first number: ");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int first = Integer.parseInt(a);

        System.out.print("Enter the second number: ");
        String b = input.nextLine();
        int second = Integer.parseInt(b);

        System.out.print("Enter the third number: ");
        String c = input.nextLine();
        int third = Integer.parseInt(c);

        // Condition includes challenge that prevents duplicate numbers
        if(first != second && first != third && second != third)
        {
            if(first > second && first > third)
            {
                System.out.println("The largest number is " + first + ".");
            }
            else if(second > first && second > third)
            {
                System.out.println("The largest number is " + second + ".");
            }
            else
            {
                System.out.println("The largest number is " + third + ".");
            }
        }
    }
}

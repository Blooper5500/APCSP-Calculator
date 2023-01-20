/*  Dominic Diebert
    Calculator Program
    Started 1/3/23
    Note: I deleted some parts of the code from class such as the unused variations of the summation function and the unused if example
*/

import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        //Create a scanner object
        Scanner scanObject = new Scanner(System.in);
        // Instantiate the object
        Calculator calvin = new Calculator();

        //Getting user inputs (I looked up how to do this outside of class by the way, just for clarity)
        System.out.println("Please enter in the first number you wanna use: ");
        float first = scanObject.nextFloat();
        System.out.println("Please enter the second number you wanna use: ");
        float second = scanObject.nextFloat();

        //Doing the math
        float sum = calvin.addition(first, second);
        float difference = calvin.subtract(first, second);
        float summation = calvin.summation3(first, second);

        //Printing the results
        System.out.println("The sum of your numbers is " + sum);
        System.out.println("The difference of your numbers is " + difference);
        System.out.println("The summation of your numbers is " + summation);
    }

    //The menu of options (Not used)
    public void displayMenu()
    {
        System.out.println("Press 1 to add");
        System.out.println("Press 2 to subtract");
        System.out.println("Press 3 to multply");
        System.out.println("Press 4 to divide");
        System.out.println("Press 5 to use an exponent");
        System.out.println("Press 6 to factorial");
        System.out.println("Press 7 to find the remainder");
        System.out.println("Press 8 to find sin");
        System.out.println("Press 9 to find cos");
        System.out.println("Press 0 to find tan");

    }

    //The add function
    public float addition(float a, float b) {

        return a + b;
    }

    //The subtraction function
    public float subtract(float a, float b) {
        return a - b;
    }

//The summation function (Using the third method of summations we talked about in class)
    public float summation3(float start, float end) {
        float sum = 0;
        for (float i = start; i <= end; i++)
        //i++ is equivilent to i + 1
        {
            sum += i;
            //sum =+ i is equivilent to sum = sum + i
        }
        return sum;
    }
}
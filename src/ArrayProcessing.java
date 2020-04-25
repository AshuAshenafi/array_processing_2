/**
 ********************************************************************************************
 *****************************************PSEUDOCODE*****************************************
 ********************************************************************************************
 *Objective
 * Define the problem by constructing an algorithm using pseudocode
 * Create an IPO diagram showing input, output, and processing steps
 * What control structures (sequence, selection and repetition) are required?
 * What variables are required?
 * Show a check of your solution with test data for at least two valid test cases
 *
 * Create an algorithm to:
 *
 * Find the sum of the elements of an array
 * Find the mean (average) of the elements of an array.
 *
 *      Start
 *      //INPUT
 *      instantiate (open) Scanner object with variable name keyboard
 *      declare and initialize constant integer vaiable ARR_LENGTH to store array length (say ten)
 *      declare array with array length to store double data type values
 *      declare double variable (input) to store when user enters a number
 *      declare double variable (sum_values) and initialize it zero to later store sum of values in the array
 *      declare double variable (average_value)
 *
 *      prompt user to enter ten numbers
 *          start FOR LOOP (initialize integer index to be zero)
 *              check index to always be less than the array length
 *              prompt user by showing index to insert (1/10), 2(10) ...
 *              scan and assign the number to input vairable
 *              assign value to array of current index
 *              increament index and go back to line 25
 *          end FOR LOOP
 *
 *      //PROCESS
 *          //CALCULATE SUM
 *          start FOR LOOP (initialize integer index to be zero)
 *              check index to always be less than the array length
 *              increament value of sum by current index array value
 *             increament index and go back to for loop until index is equal to array length
*           end FOR LOOP
 *
 *           //CALCULATE AVERAGE
 *           calculate average_value = sum_values / ARR_LENGTH
 *
 *       //OUTPUT
 *       print original array
 *       print sum of values (sum_values)
 *       print average value (average_value)
 *
 *       close scanner object
 *       end
 *
 *************************************************************************************************
 ********************************************TEST DATA-one****************************************
 *************************************************************************************************
 *
 *      Enter ten number.
 *      Enter number ( 1/10): 20
 *      Enter number ( 2/10): 25
 *      Enter number ( 3/10): 30
 *      Enter number ( 4/10): 35
 *      Enter number ( 5/10): 40
 *      Enter number ( 6/10): 45
 *      Enter number ( 7/10): 50.5
 *      Enter number ( 8/10): 60.5
 *      Enter number ( 9/10): 70.5
 *      Enter number (10/10): 85.5
 *
 *      The array is: [20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.5, 60.5, 70.5, 85.5]
 *
 *      Sum of array values = 462.00
 *      Average value of numbers = 46.20
 *
 *
 **************************************************************************************************
 ********************************************TEST DATA-two*****************************************
 **************************************************************************************************
 *      Enter ten number.
 *      Enter number ( 1/10): 99
 *      Enter number ( 2/10): 100
 *      Enter number ( 3/10): 85
 *      Enter number ( 4/10): 62
 *      Enter number ( 5/10): 10
 *      Enter number ( 6/10): 25
 *      Enter number ( 7/10): 36
 *      Enter number ( 8/10): 46
 *      Enter number ( 9/10): 52
 *      Enter number (10/10): 73
 *
 *      The array is: [99.0, 100.0, 85.0, 62.0, 10.0, 25.0, 36.0, 46.0, 52.0, 73.0]
 *
 *      Sum of array values = 588.00
 *      Average value of numbers = 58.80
 *
 */
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProcessing {
    public static void main(String[] args) {

        //INPUT

        // instantiate scanner object
        Scanner keyboard = new Scanner(System.in);

        int ARR_LENGTH = 10;
        double [] arr_forsum = new double[ARR_LENGTH];
        double input;
        double sum_values = 0;
        double average_value;

        // Prompt user to enter data
        System.out.println("Enter ten number.");
        for(int i = 0; i < ARR_LENGTH; i++){
            System.out.printf("Enter number (%2d/%d): ", (i+1), ARR_LENGTH);
            input = keyboard.nextDouble();
            arr_forsum[i] = input;
        }

        //PROCESS
        //Calculate sum
        for(int i = 0; i < ARR_LENGTH; i++){
            sum_values += arr_forsum[i];
        }
         // Calculate average
        average_value = sum_values / ARR_LENGTH;

        //OUTPUT
        System.out.println("\nThe array is: " + Arrays.toString(arr_forsum));
        System.out.println();
        System.out.printf("Sum of array values = %.2f", sum_values);
        System.out.printf("\nAverage value of numbers = %.2f", average_value);

        //close scanner object
        keyboard.close();

    }
}

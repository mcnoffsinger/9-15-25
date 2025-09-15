import java.util.Scanner;

public class NumberManipulator {
    public static Scanner scanner = new Scanner(System.in);
    public static float getFloatInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextFloat();
    }
    public static void main(String[] args) {
        


        // Prompt the user to enter a decimal number
        // Store the input in a variable
        float input = getFloatInput("Enter a float: ");

        // Print the smallest integer greater than or equal to the number
        System.out.println("Rounded down: " + (int)(Math.floor(input)));
        // Print the largest integer less than or equal to the number
        System.out.println("Rounded up: "   + (int)(Math.ceil(input)));
        // Print the integer that is closest to the number (ties go to even)
        System.out.println(
            "rounded to nearest number with ties going to the nearest even number (why?): "
            + (Math.rint(input))
            );
        // Print the integer closest to the number (standard rounding)
        System.out.println("Rounded like a typical fifth grader would: " 
            + (int)(Math.round(input))
            );

        // BONUS:
        // Cast the number to an int and print the character it represents
        // Add 1 to that number and print the next character
        // Format a summary table using formatted output
    }
}

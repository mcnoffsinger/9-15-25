import java.util.Scanner;

public class StringAnalyzer {


    public static Scanner scanner = new Scanner(System.in);


    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        

        // Prompt the user to enter a full sentence
        // Store the sentence in a String variable
        String input = getInput("Enter a full sentence. Or don't. I won't know. \n");

        // Print the number of characters in the sentence
        System.out.println("Your string was " + input.length() + " characters long\n");
        // Print the first and last characters
        System.out.println("The first character of your sentence was " + input.charAt(0) + "\n");
        System.out.println("The last character of your message was " + input.charAt(input.length()-1) + "\n");
        // Print the sentence with whitespace removed from both ends
        System.out.println("Whitespace removed: \""+ input.trim() + "\"\n" );
        // Print the sentence in all uppercase
        System.out.println("Remember ALL CAPS when you spell the name yo: \"" + input.toUpperCase() + "\"\n");
        // Print the sentence in all lowercase
        System.out.println("In lowercase form: \"" + input.toLowerCase() + "\"\n");


        // Prompt the user to enter a single character
        char newInput = (getInput("enter one character: ").trim().charAt(0));
        // Determine if it is a letter, digit, or neither
        if(Character.isLetter(newInput)){
            // If it's a letter, check if it's uppercase or lowercase
            if (Character.isUpperCase(newInput)){
                System.out.println("The character you entered is an uppercase letter\n");
            }else{
                System.out.println("The character you entered is a lowercase letter \n");

            }

        }else if(Character.isDigit(newInput)){
            System.out.println("The character you entered is a number\n");
        }else{
            System.out.println("the character you entered is not a number or a letter\n");
        }
        // Print the decimal code of the character
        System.out.println("the decimal code for your character is " +(short)(newInput));
        // BONUS:
        // Prompt the user for a substring to search for
        // Display the index of the first occurrence or -1 if not found
    }
}

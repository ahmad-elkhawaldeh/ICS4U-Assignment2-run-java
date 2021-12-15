/*
* The Run program.
*
* @author  Ahmad El-khawaldeh
* @version 1.0
* @since   2020-01-01
*/

import java.util.Scanner;

/**
* This is the calculating heating time program.
*/
final class Run {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    *
    */
    private Run() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] final args) {
    /**
    * This is the maxRun.
    *
    * @param str is good
    * @return largestRun
    */
    static int maxRun(final String str) {
        int largestRun = 1;
        int temp = 1;

        for (int word = 1; word < str.length(); word++) {
            if (str.charAt(word) == str.charAt(word - 1)) {
                ++temp;
            } else {
                largestRun = Math.max(largestRun, temp);
                temp = 1;
            }
        }

        largestRun = Math.max(largestRun, temp);

        return largestRun;
    }

        String inputString = null;
        System.out.print("Enter string : ");
        final Scanner scanner = new Scanner(System.in);
        inputString = scanner.nextLine();

        try {
            if (inputString.matches(".*\\d.*")) {
                throw new Exception("Incorrect input");
            } else {
                System.out.println(maxRun(inputString));
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

package revision;

import java.util.Scanner;

public class UserInputUtilities {
    /**
     * Gets an int from the user.
     *
     * If the user enters text, they will be informed that they need to enter a number and the process will repeat.
     *
     * @param prompt The informative text to be displayed to the user
     * @return The user-supplied number
     */
    public static int getValidInt(String prompt){
        Scanner sc = new Scanner(System.in);
        int num = -1;
        boolean valid = false;
        while(!valid) {
            System.out.println(prompt);
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                valid = true;
            } else {
                System.out.println("Not a number.");
                sc.nextLine();
                System.out.println(prompt);
            }
        }
        return num;
    }

    /**
     * Gets an int from the user and validates it is within a specified range.
     *
     * @param prompt The informative text to be displayed to the user
     * @param low The lowest number acceptable
     * @param high The highest number acceptable
     * @return The number entered by the user
     */
    public static int getValidInt(String prompt, int low, int high){
        Scanner sc = new Scanner(System.in);
        int num = -1;
        boolean valid = false;
        while(!valid) {
            System.out.println(prompt);
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if(num <= high && num >= low) {
                    valid = true;
                }else{
                    System.out.println("Value provided not within range (between "+ low +" and " + high);
                }
            } else {
                System.out.println("Not a number.");
                sc.nextLine();
                System.out.println(prompt);
            }
        }
        return num;
    }

    /**
     * Find the largest number in a supplied array of ints.
     * @param nums The array of numbers (integers).
     * @return The largest number found in the array (an int).
     */
    public static int getMax(int [] nums){
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    /**
     * Find the largest number in a supplied array of doubles.
     * @param nums The array of numbers (doubles).
     * @return The largest number found in the array (a double).
     *
     */
    public static double getMax(double [] nums){
        double max = nums[0];
        for(double num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

}

package revision;

import java.util.Scanner;

public class UserDrivenRunningTotal {
    public static void main(String[] args) {
        // Write a program that:
        // 1) Repeatedly takes in numbers from the user. Input should terminate when -1 is entered
        Scanner input = new Scanner(System.in);

        int num = 0;
        // Create a variable to track the total
        int total = 0;
        // Create a counter to track how many numbers we've entered
        int count = 0;
        // loop until the user enters -1
        while(num != -1){
            // INFORMATIVELY prompt the user to enter a number
            System.out.println("Please enter a number: (-1 to exit)");
            // Take in the number from the user
            num = input.nextInt();

            total = total + num;
            count++;
        }
        total++;
        count--;
        double average = (double)total/(double)count;
        System.out.println("-1 has been entered!");
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}

package revision;

import java.util.Scanner;

public class UserInputUtilities {
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
}

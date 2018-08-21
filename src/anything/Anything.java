package anything;

import java.util.Random;
import java.util.Scanner;
public class Anything {
    public static void main (String args []) {
        String generatedPassword = generatePassword(10).toString();
        System.out.println(generatedPassword);

        Scanner scan = new Scanner(System.in);
        boolean correctLogin = false;
        String username;
        String enteredUsername;
        String enteredPassword;

        System.out.println("Please enter a username");
        username = scan.nextLine();


        while (correctLogin != true) {
            System.out.println("Login Below");
            System.out.println("Enter your username");
            enteredUsername = scan.nextLine();

            System.out.println(" Next, enter your password");
            enteredPassword = scan.nextLine();

            if (enteredUsername.equals(username) && generatedPassword.equals(enteredPassword)) {
                System.out.println(" You have entered the correct logininfo");
                correctLogin = true;

            } else {
                System.out.println("Your login info was incorrect, please try again");
            }

        }
        System.out.println(" Your are now logged in Congrats");
    }



    private static char[] generatePassword(int length) {
        System.out.println(" your new password: ");
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "O13456789";
        String splChar = "!@#$%^&*";

        String pwd = letters + numbers + splChar;
        Random r = new Random();
        char[] newPass = new char[length];

        for (int i = 0; i < length;i++){
            newPass[i] = pwd.charAt(r.nextInt(pwd.length()));
        }
        return newPass;
    }
}


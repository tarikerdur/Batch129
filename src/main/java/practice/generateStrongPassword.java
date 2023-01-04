package practice;

import java.util.Random;
import java.util.Scanner;

public class generateStrongPassword {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password length\t: ");
        System.out.print("Your random password is\t\t: " + (generatePassword(input.nextInt())));

    }

    static char[] generatePassword(int length) {
        String charslower = "qwertyuiopasdfghjklzxcvbnm";
        String charsUpper = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String nums = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>";

        String passChars = charslower + charsUpper + nums + symbols;
        Random rnd = new Random();

        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            password[i] = passChars.charAt(rnd.nextInt(passChars.length()));
        }
        return password;
    }

}

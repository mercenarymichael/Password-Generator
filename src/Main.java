import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to my password generator app!");
        System.out.println("How long is the password to generate?");
        Scanner scr = new Scanner(System.in);
        int length = Integer.parseInt(scr.next());
        Password pswd = new Password(Generator.generatePassword(length));
        pswd.savePassword();
    }


}
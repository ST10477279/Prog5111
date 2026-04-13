package poe_part1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        System.out.println("========================================");
        System.out.println("   Welcome to the Chat Application");
        System.out.println("========================================");
        System.out.println();

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();

        login.setFirstName(firstName);
        login.setLastName(lastName);

        System.out.println();
        System.out.println("--- REGISTRATION ---");
        System.out.println();

        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Enter password: ");
        String password = scanner.nextLine().trim();

        System.out.print("Enter cell phone number (e.g. +27838968976): ");
        String cellPhone = scanner.nextLine().trim();

        System.out.println();
        String registrationResult = login.registerUser(username, password, cellPhone);
        System.out.println(registrationResult);

        System.out.println();
        System.out.println("--- LOGIN ---");
        System.out.println();

        System.out.print("Enter username: ");
        String loginUsername = scanner.nextLine().trim();

        System.out.print("Enter password: ");
        String loginPassword = scanner.nextLine().trim();

        boolean loginSuccess = login.loginUser(loginUsername, loginPassword);

        System.out.println();
        System.out.println(login.returnLoginStatus(loginSuccess));

        scanner.close();
    }
}
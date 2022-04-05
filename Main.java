package com.timbuchalka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Prompt user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2022 - yearOfBirth;
            if(age >= 0 && age <= 120) {
                System.out.println("Your name is " + name + ", and you're " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close();
    }
}

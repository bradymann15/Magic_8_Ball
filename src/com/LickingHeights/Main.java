package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare
        Scanner keyboard;
        int testing;
        String question;

        //initialize+code
        keyboard = new Scanner(System.in);
        System.out.println("Welcome to Magic 8 Ball!");
        System.out.println("What is your question?");
        question = keyboard.nextLine();
        System.out.println("Now, give a number between 1 and 100");
        testing = keyboard.nextInt();
        if (testing<=10) {
            System.out.println("Sure thing!");
        }
        else if (testing<=20) {
            System.out.println("Not so sure about that...");
        }
        else if (testing<=30) {
            System.out.println("Not today..");
        }
        else if (testing<=40); {
            System.out.println("You bet ya!");
        }

    }
}

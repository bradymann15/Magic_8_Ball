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
        else if (testing<=40) {
            System.out.println("You bet ya!");
        }
        else if (testing<=50) {
            System.out.println("Not in this life time..");
        }
        else if (testing<=60) {
            System.out.println("Sometime soon..");
        }
        else if (testing<=70) {
            System.out.println("No luck there...");
        }
        else if (testing<=80) {
            System.out.println("Nope!");
        }
        else if (testing<=90) {
            System.out.println("You got it");
        }
        else {
            System.out.println("Absolutely");
            }

}

}

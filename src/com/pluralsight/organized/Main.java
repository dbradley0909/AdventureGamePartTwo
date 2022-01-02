package com.pluralsight.organized;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);


        System.out.println("The game is about to start...");
        System.out.println("Loading up...");
        System.out.printf("... %n... %n..%nBegin!%n");
        System.out.println("Hi there what is your name?");
        String name = input.nextLine();  // Get user input
        System.out.println("Hi, " + name + " Welcome to The Creepy Mars Adventure Game!");
        System.out.printf("Are you excited to play?%n(Answer: Y for yes or N for no)%n");
        input.nextLine();
        String answer = "Y";

        if (answer == "Y") {
            System.out.println("> Awe, great to hear! It's so cool that you're going to the haunted part of Mars!!");

        } else {
            System.out.println("> Sorry to hear your not excited but thanks for your response!");
        }

        System.out.println("Are you bringing suitcases and if so how many?");
        input.nextLine();
        int suitcases = 4;
        if (suitcases > 2) {
            System.out.println("That's to many, we have a limit of two or less!");
        } else if (suitcases == 2) {
            System.out.println("> That's perfect!");
        } else {
            System.out.println("> Great packing skills");
        }
        System.out.println("> What kind of companion animal would you like to bring");

        String companion = input.nextLine();  // Get user input
        System.out.println("We have a policy where the " + companion + " has to be in a cage when you travel to Mars!");


        System.out.println("What is your companion's name?");

        String companionName = input.nextLine();  // Get user input
        System.out.println("Cool, so you're bringing " + companionName + " the " + companion);

        System.out.println("You have a couple of options for the interior decor of your ship. How would you like to style it?");
        System.out.printf("Your options are:%n" +
                " A  Sleek and modern%n" +
                " B  Retro/vintage space age%n" +
                " C  Minimalism%n");
             input.nextLine();
        String interior = "A";
        if (interior == "A") {
            System.out.println(">  Sleek and modern, nice choice!");
        } else if (interior == "B") {
            System.out.println("> So cool! the retro style is really in!");
        } else {
            System.out.println(">Minimalism, lot's of space is always great!");
        }
        System.out.printf("I can see it now:%n " +
                name + " and "+ companionName +"surfing the celestial abyss ... %n" +
                "in aspaceship.%n" +
                "You crawl into the spaceship with "+ companionName + "and  brace for take off!");
        System.out.printf("5...%n4...%n3..%n..2%n..1%n* Lift Off! *");
    }
}




//       // int number = rand.nextInt(100) + 1;
//        //System.out.println("number is " + number);
//
//        int trycount = 0;
//        while (true) {
//            System.out.println("Enter your guess(1-100):");
//
//            //int playerGuess = scanner.nextInt();
//
//
//            int playerGuess = 0;
//            try {
//                playerGuess = scanner.nextInt();
//            } catch (Exception e) {
//                //input.nextLine();
//                System.out.println("That's not an integer, enter " + number);
//                continue;
//            }
//            trycount++;
//
//            if (playerGuess == number) {
//                System.out.println("Correct! you win!");
//                System.out.println("You had " + trycount + "tries!");
//                break;
//            } else if (number > playerGuess) {
//                System.out.println("Nope, the number is higher. guess again!");
//            } else {
//                System.out.println("Nope, the number is lower. guess again!");
//            }
//        }
//
//        scanner.close();
//    }
//}

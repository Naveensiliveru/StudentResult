package com.codsoft;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);
		 int totalScore= 0;
		  int rounds = 0;
		  String  playAgin;
		  System.out.println(" welcome to the Number guessing game");
		  
		
		
		  do {
	            rounds++;
	            totalScore += playRound(sc);

	            // Ask if the player wants to play another round
	            System.out.print("Do you want to play another round? (yes/no): ");
	            playAgin = sc.next().toLowerCase();
	        } while (playAgin.equals("yes"));
		  }

	private static int playRound(Scanner sc) {
		 Random random = new Random();
	
		  int numberToguess =random.nextInt(100)+1;
		  int  maxAttempts = 7;
		   int attempts =0;
		    int userGuess=0;
		    int Score =0;
		    

	        System.out.println("\nI've picked a number between 1 and 100. Can you guess it?");
	        System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

	        while (attempts < maxAttempts) {
	            attempts++;

	            // Prompt the user to enter their guess
	            System.out.print("Attempt " + attempts + "/" + maxAttempts + ": Enter your guess: ");
	            userGuess = sc.nextInt();

	            // Compare the user's guess with the generated number
	            if (userGuess < numberToguess) {
	                System.out.println("Too low! Try again.");
	            } else if (userGuess > numberToguess) {
	                System.out.println("Too high! Try again.");
	            } else {
	                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
	                Score++;
	                break;
	            }
	        }

	        if (userGuess != numberToguess) {
	            System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + numberToguess + ".");
	        }

	        return Score;
	    }
	
}



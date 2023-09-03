package randomnumber;

import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class randomnumber {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String play = "yes";


        //while loop to determine if we are going to play the game again
                while (play.equals("yes"))
                {
                    Random rand = new Random();
                    int randnum= rand.nextInt(20);
                    int guess = -1;
                    int tries = 0;
                    
                    //while loop to check if the game is over
                    while(guess!= randnum)
                    {
                        System.out.println("Guess a number between 1 and 20 : ");
                        guess= read.nextInt();
                        tries ++;

                        if(guess == randnum)
                        {
                            System.out.println("Awesom you guess the number");
                            System.out.println("It only took you " + tries + "guesses!");
                            System.out.println("Would you like to play again ? Yes or No");
                            play  = read.next().toLowerCase();
                         }
                         else if(guess > randnum)
                         {

                        System.out.println("Your guess is too high,try again ");
                         }
                         else{
                            System.out.println("Your guess is to low, try again");
                         }

                    }


                }
        read.close();

    }
    
} 

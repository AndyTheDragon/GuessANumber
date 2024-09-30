package org.lvl3;

import java.util.Random;

public class GuessANumberGame
{
    private final int numberToGuess;
    private int numberOfGuesses;
    private final UI ui;

    GuessANumberGame() {
        this.numberOfGuesses = 0;
        Random rand = new Random();
        this.numberToGuess = rand.nextInt(100) + 1;
        this.ui = new LocalUI();
    }

    public void startGame() {
        gameLoop();
    }

    private void gameLoop() {
        int userGuess;
        do {
            ui.sendMsg( "Please input an integer between 1 and 100" );
            userGuess = ui.getUserInput();
            numberOfGuesses++;
            ui.sendMsg( giveFeedback(userGuess,numberToGuess) );
        }
        while (numberToGuess != userGuess);
        ui.sendMsg( endGameMsg(numberOfGuesses) );
    }

    private String giveFeedback(int numberToGuess, int userGuess)
    {
        if (numberToGuess > userGuess) {
            return "Your guess is too high!";
        }
        if (numberToGuess < userGuess) {
            return "Your guess is too low!";
        }
        return "You guessed the number " + numberToGuess + " correctly!";
    }

    private String endGameMsg(int numberOfGuesses) {
        return "You used " + numberOfGuesses + " guesses!";
    }
}

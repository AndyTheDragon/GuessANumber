# Gæt et tal, med metoder

Formålet med denne opgave er at lave en version af Gæt et Tal spillet, som bruger metoder og klasser. Idéen er at vi skal bygge oven på denne version, for at fremhæve nogle objekt-orienterede principper. 


## Opgave

Lav et konsolbaseret spil, hvor brugeren skal gætte et tilfældigt genereret tal mellem 1 og 100:

* Programmet skal have følgende struktur:
````
@startuml
'https://plantuml.com/class-diagram

class Main
class GuessANumberGame
interface UI
class LocalUI

UI <|-- LocalUI


class GuessANumberGame {
    -int numberToGuess
    -int userGuess
    -int numberOfGuesses
    -UI ui
    -Random rand
    +GuessANumberGame()
    +void startGame()
    -void gameLoop()
    - String giveFeedback(int, int)
    -String endGameMsg(int)
}
interface UI {
    +int getUserInput()
    +void sendMsg(String)
}
class LocalUI {
    - Scanner scanner
    +int getUserInput()
    +void sendMsg()
}
class Main {
+static void main(String[] args)
}


@enduml
````
* Programmet skal tale med brugeren gennem en `UI` klasse, `LocalUI`.
* `LocalUI` skal bruge `System.out.println()` til at sende beskeder til brugeren.
* `LocalUI` skal bruge `Scanner(System.in)`til at modtage beskeder fra brugeren.
* Du skal lave fejlhåndtering på input i UI klassen, og sikre at vi modtager korrekte input.
* `startGame()` skal sende en velkomsthilsen til brugeren og starte `gameLoop()`.
* `gameLoop()` skal bede brugeren om at indtaste et tal, og så sende en besked tilbage til brugeren. Beskeden skal genenreres af `giveFeedback(int, int)`.
* Spillet skal holde styr på hvor mange gange der er blevet gættet.
* Efter brugeren har gættet det korrekte tal, skal der sendes en besked genereret af `endGameMsg(int)`.

## Bonuspoint

Du må gerne udvide spillet med følgende:

* I en fremtidig version af programmet skal vi både kunne modtage og behandle `String`s og `int`s fra brugeren gennem vores UI.
* Lad brugeren vælge det maksimale tal, som det genererede tal kan være.
* Spørg efter brugerens navn, og lav personaliserede beskeder.

## Hjælp

<details>
      <summary>GuessANumberGame()</summary>

      ```
        GuessANumberGame() {
        this.numberOfGuesses = 0;
        this.rand = new Random();
        this.numberToGuess = rand.nextInt(100) + 1;
        this.ui = new LocalUI();
    }
      ```
</details>

<details>
      <summary>try-catch</summary>
      `Integer.parseInt( String )` kaster med `NumberFormatException`.
</details>

<details>
      <summary>brug do-while igameLoop()</summary>

      ```
        private void gameLoop() {
        do {
            ui.sendMsg( "Please input an integer between 1 and 100" );
            userGuess = ui.getUserInput();
            numberOfGuesses++;
            ui.sendMsg( giveFeedback(userGuess,numberToGuess) );
        }
        while (numberToGuess != userGuess);
        ui.sendMsg( endGameMsg(numberOfGuesses, numberToGuess) );
    }
      ```
</details>


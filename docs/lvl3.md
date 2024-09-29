# Gæt et tal, med metoder og Unit Test

Vi er nået til level 3 i Gæt et Tal spilserien. I level 2 har vi brugt en passende mængde metoder fordelt på et overkill af klasser, og endda lavet et Interface. I den ideelle verden havde vi allerede skrevet Unit Test inden vi begyndte at kode, men jeg havde allerede glemt den første uges undervisning i Test Driven Development. Derfor laver vi nu Unit Test på alle metoder som ikke er void. Vi bliver nok nødt til at refaktorere lidt, så det er muligt at lave test på `LocalUI.getUserInput()`.


## Opgave

Lav Unit Test til vores spil.

* Tilføj JUnit til `pom.xml` filen.
* Metoder som er public og ikke er void skal have en Unit Test, dvs. `LocalUI.getUserInput()`.
* Men lige nu kommer input altid fra konsolen. Vi bliver nødt til at refaktor koden, så vi kan vælge hvor input skal komme fra.
* Dette gøres nemmest ved at lave en default constructor, som bruger `System.in` som input, og en overloaded constructor, der tager en `InputStream` som parameter, og sender videre til Scanner objektet.
* I din Unit Test kan du nu lave en `ByteArrayInputStream` som simulerer forskellige input.

## Bonuspoint

Du må gerne udvide spillet med følgende:

* I en fremtidig version af programmet skal vi både kunne modtage og behandle `String`s og `int`s fra brugeren gennem vores UI.
* Lad brugeren vælge det maksimale tal, som det genererede tal kan være.
* Spørg efter brugerens navn, og lav personaliserede beskeder.

## Hjælp

<details>
      <summary>Test getUserInput_validInput()</summary>

      ````
        @Test
        void getUserInput_validInput()
        {
            //Arrange
            int expected = 42;
            String input = "42\n";
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            LocalUI localUI = new LocalUI(in);

            //Act
            int result = localUI.getUserInput();

            //Assert
            assertEquals(expected, result);
        }
      ````
</details>

<details>
      <summary>To constructors</summary>
      
      ````
        LocalUI() {
            this.scanner = new Scanner(System.in);
        }

        LocalUI(InputStream inputStream)
        {
            this.scanner = new Scanner(inputStream);
        }
    ````
</details>



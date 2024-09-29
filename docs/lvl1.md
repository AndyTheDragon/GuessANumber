# Gæt et tal, den simple version

Formålet med denne opgave er at lave en meget simpel version af Gæt et Tal spillet, som vi også lavede på første semester. Det er meningen at du ikke skal lave nogle metoder, men bare kode alting i et while loop i main metoden. Idéen er at vi skal kunne se den progression vi har gennemgået, og forhåbentligt reflektere over hvorfor det er smart med flere klasser og metoder.

## Opgave

Lav et simpelt konsolbaseret spil, hvor brugeren skal gætte et tilfældigt genereret tal mellem 1 og 100:

* Programmet skal kun have en metode, main metoden.
* Programmet skal bruge et `while` eller et `do-while` loop.
* Programmet skal generere et tilfældigt tal mellem 1 og 100 ved start.
* Brugeren skal derefter gætte tallet ved at indtaste et gæt på konsolen.
* Inputtet skal konverteres til et `int`.
* Programmet skal give feedback på brugerens gæt: "for højt", "for lavt" eller "korrekt".
* Hvis brugeren gætter forkert, skal programmet fortsætte med at bede om et nyt gæt, indtil brugeren gætter rigtigt.
* Du skal ikke lave nogen fejlhåndtering (hvis f.eks. brugeren indtaster bogstaver, eller forkerte tal).

## Bonuspoint

Du må gerne udvide spillet med følgende:

* Tæl antal forsøg brugeren har brugt på at gætte tallet.
* Lad brugeren vælge det maksimale tal, som det genererede tal kan være.

## Hjælp

<details>
      <summary>Generer tilfældigt tal</summary>

      ```
        Random randomGenerator = new Random();
        System.out.println(randomGenerator.nextInt(100));
      ```
</details>

<details>
      <summary>Læs user input fra konsol</summary>

      ```
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
      ```
</details>

<details>
      <summary>Konverter `String` til `int`</summary>

      ```
        int guess = Integer.ParseInt(input);
      ```
</details>


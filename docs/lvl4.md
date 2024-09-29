# Gæt et tal - fra en fil

Du må gerne springe dette trin over, hvis du også synes det lyder fjollet at bruge en fil som input til vores Gæt et Tal spil.


## Opgave

Lav en ny UI klasse, som læser input fra en fil. Ti lat begynde med skal output stadig være til konsolen.

* Metoder som er public og ikke returnerer void skal have en Unit Test.



## Hjælp

<details>
    <summary>Test getUserInput_validInput()</summary>

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
</details>

<details>
    <summary>To constructors</summary>

    LocalUI() {
        this.scanner = new Scanner(System.in);
    }
    
    LocalUI(InputStream inputStream)
    {
        this.scanner = new Scanner(inputStream);
    }
</details>



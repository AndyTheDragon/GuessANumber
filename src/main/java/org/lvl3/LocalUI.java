package org.lvl3;

import java.io.InputStream;
import java.util.Scanner;

public class LocalUI implements UI
{
    private final Scanner scanner;

    LocalUI() {
        this.scanner = new Scanner(System.in);
    }

    LocalUI(InputStream inputStream)
    {
        this.scanner = new Scanner(inputStream);
    }

    @Override
    public int getUserInput()
    {
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        }
        catch (NumberFormatException e) {
            sendMsg("Please input an integer");
            return getUserInput();
        }

    }

    @Override
    public void sendMsg(String msg) {
        System.out.println(msg);
    }
}

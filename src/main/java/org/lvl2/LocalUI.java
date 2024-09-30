package org.lvl2;

import java.util.Scanner;

public class LocalUI implements UI
{
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public int getUserInput()
    {
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            try {
                int output = Integer.parseInt(input);
                return output;
            }
            catch (NumberFormatException e) {
                sendMsg("Please input an integer");
            }
        }
        return 0;
    }

    @Override
    public void sendMsg(String msg) {
        System.out.println(msg);
    }
}

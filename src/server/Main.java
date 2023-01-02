package server;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileStorage fileStorage = new FileStorage();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.next().trim();
            String file = scanner.nextLine().trim();

            if (command.equals("add")) {
                fileStorage.addFile(file);
            }
            if (command.equals("get")) {
                fileStorage.getFile(file);
            }
            if (command.equals("delete")) {
                fileStorage.deleteFile(file);
            }
            if (command.equals("exit")) {
                System.exit(0);
            }
        }

    }
}
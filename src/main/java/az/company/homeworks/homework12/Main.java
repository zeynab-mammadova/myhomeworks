package az.company.homeworks.homework12;


import az.company.homeworks.homework12.console.Console;
import az.company.homeworks.homework12.console.SystemConsole;

public class Main {
    public static void main(String[] args) throws Exception {
        Console console = new SystemConsole();
        Core app = new Core(console);
        app.run();
    }
}

package day02_Variables;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("\tHello");
        System.out.println("\t\t\t\t\t\tHello");
            // \t means a paragraph space
        System.out.println("Cybertek Scholl");
        System.out.println("Cybertek \nScholl");
        System.out.println();
        System.out.println("My\nname\nis\nIbrahim");
            // \n means a new line
        System.out.println("Cybertek Scholl");
        System.out.println("Cybertek \nScholl");
        System.out.println("\n\n\n\nMy\nname\nis\nIbrahim");
            // \n means a new line, starts with new line

            // print: My favorite TV show is "Game of Thrones"
        System.out.println("My favorite TV show is \"Game of Thrones\"");
            // \" means double quote prints double quote to the console
        System.out.println("My favorite book is \"Java\"");
        System.out.println("\\");
            // \\ prints single slash on console
        System.out.println("/");
        System.out.println("My favorite book is 'Java'");

    }

}

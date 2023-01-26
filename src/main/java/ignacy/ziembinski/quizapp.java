package ignacy.ziembinski;

import java.util.Scanner;

public class quizapp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("W którym roku powstała pierwsza gra Super Mario Bros");
        System.out.println("A)1984");
        System.out.println("B)1987");
        System.out.println("C)1985");

        System.out.println("Wpisz swoją odpowiedź");
        String answer = scanner.nextLine();

        while (!answer.equalsIgnoreCase("c")
                ||!answer.equalsIgnoreCase("c")){
            System.out.println("Możliwe odpowiedzi to A B lub C");
        answer = scanner.nextLine();

        }

        System.out.println("Odpowiedziałeś " + answer);

        if (answer.equalsIgnoreCase("c")) {
            System.out.println("Dobrze!");
        } else {
            System.out.println("Złe!");

        }
        }
    }
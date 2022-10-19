package ignacy.ziembinski;

public class App {

    public static void main(String[] args) {

        String[] openhours = {"10.30-13.30 16.30-23.00","11.30-14.00 16.30-22.00","dziś zamknięte"};

        for (int i = 0; i < openhours.length; i++) {
            printlnmessege(openhours[i]);
            System.out.println("---------------------");
        }

    }



    static void printlnmessege(String openHours) {


        System.out.println("witajcie klienci");
        System.out.println("podajemy Włoskie dania");
        System.out.println("godziny otwarcia " + openHours);
        System.out.println("kliknij TUTAJ żeby zobaczyć menu");
        System.out.println("godziny " + openHours + " mogą ulec zmianie");
    }
}


package ignacy.ziembinski;

public class App  {

    public static void main(String[] args) {
    printlnmessege("10.30-13.30 16.30-23.00");
    printlnmessege("dziś nie czynne");
    }
    static void printlnmessege(String openHours){


        System.out.println("witajcie klienci");
        System.out.println("podajemy Włoskie dania");
        System.out.println("godziny otwarcia " +openHours);
        System.out.println("kliknij TUTAJ żeby zobaczyć menu");
        System.out.println("godziny " + openHours +" mogą ulec zmianie");
    }
    }


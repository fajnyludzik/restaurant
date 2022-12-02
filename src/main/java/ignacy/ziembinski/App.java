package ignacy.ziembinski;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Employee Cook = new Employee("Zdzichu","Perlond","Cooker chef");
        Employee Cook2 = new Employee("Janek","Perlond","Cooker");
        Employee waiter = new Employee("Bartek","Niemiecki","waiter");
        Employee waiter2 = new Employee("Kacper","Włoski","waiter");
        Employee waiter3 = new Employee("Mateusz","Nowak","waiter");
        Employee waiter4 = new Employee("Paweł","Żabuś","waiter");

        List<Employee> pracownicy = List.of(Cook,Cook2,waiter,waiter2,waiter3,waiter4);
        System.out.println(pracownicy);

        System.out.println(Cook.fullInfo());

       Restaurant restaurant = new Restaurant();
        System.out.println(restaurant.name);

        restaurant.name = "program został zhakowany";

        System.out.println(restaurant.name);

        String[] openhours = {"10.30-13.30 16.30-23.00", "11.30-14.00 16.30-22.00", "dziś zamknięte"};
        if (restaurant.includsdesserts) {
           System.out.println("restauracja ma toalete");
        }
        for (String each : openhours) {
            printlnmessege(each);
            System.out.println("----------------");
        }
    }
    static void printlnmessege(String openHours) {

        if (openHours.equals("dziś zamknięte")) {
            System.out.println("dziś zamknięte");
        } else {
            System.out.println("witajcie klienci");
            System.out.println("podajemy Włoskie dania");
            System.out.println("godziny otwarcia " + openHours);
            System.out.println("kliknij TUTAJ żeby zobaczyć menu");
            System.out.println("godziny " + openHours + " mogą ulec zmianie");
        }
    }
}

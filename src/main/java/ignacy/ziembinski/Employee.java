package ignacy.ziembinski;

public class Employee {
    String firstname;

    String lastname;

    String position;

    public Employee(String firstname, String lastname, String position) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.position = position;
    }

    public String fullInfo() {
        return firstname + " " + lastname + " " + position;
    }

    @Override
    public String toString() {
        return fullInfo();
    }
}

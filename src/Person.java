public class Person{

    // properties of a person:
    private String firstName;
    private String surname;
    private String team;

    // constructor function
    public Person(String firstName, String surname, String team) {
        this.firstName = firstName;
        this.surname = surname;
        this.team = team;
    }
    
    // getter and setter methods:
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}

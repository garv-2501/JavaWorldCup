public class Person {

    // properties of a person:
    private String firstName;
    private String surName;
    private String team;

    // Create a constructor function
    public Person(String firstName, String surName, String team) {
        this.firstName = firstName;
        this.surName = surName;
        this.team = team;
    }
    
    // getter and setter methods:
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return this.surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}

public class Manager extends Person{

    // properties of a manager:
    private String favouredFormation;
    private double respect;
    private double ability;
    private double knowledge;
    private double belief;

    // constructor function
    public Manager(String firstName, String surname, String team, String favouredFormation, double respect, double ability, double knowledge, double belief) {
        super(firstName, surname, team);
        this.favouredFormation = favouredFormation;
        this.respect = respect;
        this.ability = ability;
        this.knowledge = knowledge;
        this.belief = belief;
    }

    // getter and setter methods:
    public String getFavouredFormation() {
        return this.favouredFormation;
    }

    public void setFavouredFormation(String favouredFormation) {
        this.favouredFormation = favouredFormation;
    }

    public double getRespect() {
        return this.respect;
    }

    public void setRespect(double respect) {
        this.respect = respect;
    }

    public double getAbility() {
        return this.ability;
    }

    public void setAbility(double ability) {
        this.ability = ability;
    }

    public double getKnowledge() {
        return this.knowledge;
    }

    public void setKnowledge(double knowledge) {
        this.knowledge = knowledge;
    }

    public double getBelief() {
        return this.belief;
    }

    public void setBelief(double belief) {
        this.belief = belief;
    }
}


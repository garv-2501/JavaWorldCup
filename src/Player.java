public class Player {
    
    // properties of a player:
    private String position;
    private double fitness;
    private double passingAccuracy;
    private double shotAccuracy;
    private double shotFrequency;
    private double defensiveness;
    private double aggression;
    private double positioning;
    private double dribbling;
    private double chanceCreation;
    private double offsideAdherence;

    // constructor function
    public Player(String position, double fitness, double passingAccuracy, double shotAccuracy,
                  double shotFrequency, double defensiveness, double aggression, double positioning,
                  double dribbling, double chanceCreation, double offsideAdherence) {
        this.position = position;
        this.fitness = fitness;
        this.passingAccuracy = passingAccuracy;
        this.shotAccuracy = shotAccuracy;
        this.shotFrequency = shotFrequency;
        this.defensiveness = defensiveness;
        this.aggression = aggression;
        this.positioning = positioning;
        this.dribbling = dribbling;
        this.chanceCreation = chanceCreation;
        this.offsideAdherence = offsideAdherence;
    }

    // getter and setter methods:
    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getFitness() {
        return this.fitness;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    public double getPassingAccuracy() {
        return this.passingAccuracy;
    }

    public void setPassingAccuracy(double passingAccuracy) {
        this.passingAccuracy = passingAccuracy;
    }

    public double getShotAccuracy() {
        return this.shotAccuracy;
    }

    public void setShotAccuracy(double shotAccuracy) {
        this.shotAccuracy = shotAccuracy;
    }

    public double getShotFrequency() {
        return this.shotFrequency;
    }

    public void setShotFrequency(double shotFrequency) {
        this.shotFrequency = shotFrequency;
    }

    public double getDefensiveness() {
        return this.defensiveness;
    }

    public void setDefensiveness(double defensiveness) {
        this.defensiveness = defensiveness;
    }

    public double getAggression() {
        return this.aggression;
    }

    public void setAggression(double aggression) {
        this.aggression = aggression;
    }

    public double getPositioning() {
        return this.positioning;
    }

    public void setPositioning(double positioning) {
        this.positioning = positioning;
    }

    public double getDribbling() {
        return this.dribbling;
    }

    public void setDribbling(double dribbling) {
        this.dribbling = dribbling;
    }

    public double getChanceCreation() {
        return this.chanceCreation;
    }

    public void setChanceCreation(double chanceCreation) {
        this.chanceCreation = chanceCreation;
    }
    
    public double getOffsideAdherence() {
        return this.offsideAdherence;
    }
    
    public void setOffsideAdherence(double offsideAdherence) {
        this.offsideAdherence = offsideAdherence;
    }
}    

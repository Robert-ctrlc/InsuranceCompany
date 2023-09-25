package AssignmentExercise;
class Policy {
    private static int nextPolicyId = 1;
    private int policyId;
    private Driver driver;
    private Car car;
    private double premium;
    private int numberOfClaims;

    public Policy(Driver driver, Car car, double premium) {
        //whenever it creates a policyid it increments from the previous policy number
        this.policyId = nextPolicyId++;
        this.driver = driver;
        this.car = car;
        this.premium = premium;
        this.numberOfClaims = 0;
    }

    // Getters and setters for policy 
    public int getPolicyId() {
        return policyId;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public int getNumberOfClaims() {
        return numberOfClaims;
    }

    public void setNumberOfClaims(int numberOfClaims) {
        this.numberOfClaims = numberOfClaims;
    }

    public void incrementClaims() {
        this.numberOfClaims++;
    }
}
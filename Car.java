package AssignmentExercise;
class Car {
    private String registrationNumber;
    private int yearOfManufacture;
    private double engineSize;
    private boolean isNCTPassed;

    public Car(String registrationNumber, int yearOfManufacture, double engineSize, boolean isNCTPassed) {
        this.registrationNumber = registrationNumber;
        this.yearOfManufacture = yearOfManufacture;
        this.engineSize = engineSize;
        this.isNCTPassed = isNCTPassed;
    }

    // Getters and setters for car 
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public boolean isNCTPassed() {
        return isNCTPassed;
    }

    public void setNCTPassed(boolean NCTPassed) {
        isNCTPassed = NCTPassed;
    }
}
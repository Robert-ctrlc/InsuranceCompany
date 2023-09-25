package AssignmentExercise;
class Driver {
    private String licenseNumber;
    private String name;
    private int points;
    private String contactNumber;

    public Driver(String licenseNumber, String name, int points, String contactNumber) {
        this.licenseNumber = licenseNumber;
        this.name = name;
        this.points = points;
        this.contactNumber = contactNumber;
    }

    // Getters and setters for driver 
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
package AssignmentExercise;
import java.util.ArrayList;
import java.util.List;

 class InsuranceSystem {
     //creates 3 Array lists
    private List<Driver> drivers = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();
    private List<Policy> policies = new ArrayList<>();

    //adds new driver tothe system
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }
    //adds new car to the system
    public void addCar(Car car) {
        cars.add(car);
    }
    //creates policy using information of the drivers and car
    public void createPolicy(Driver driver, Car car, double premium) {
        if (driver.getPoints() < 12 && car.isNCTPassed()) {
            Policy policy = new Policy(driver, car, premium);
            policies.add(policy);
            System.out.println("Policy created successfully. Policy ID: " + policy.getPolicyId());
        } else {
            System.out.println("Policy creation failed. Driver or car not eligible.");
        }
    }
    //delete policy using policy id
    public void deletePolicy(int policyId) {
        //loop to run through array and find matching policy id using an if statement, if it doesnt find the loop ends
        for (Policy policy : policies) {
            if(policy.getPolicyId() == policyId){
                policies.remove(policy);
                System.out.println("This policy has been deleted. Policy ID:" + policyId);
                return;
            }
        }
        System.out.println("This Policy ID cannot be found in the system : " + policyId);
    }

    public void premiumsAnually(){
        for(Policy policy : policies){
            //creates a premium variable that stores the premium amount from the array
            double currentPremium = policy.getPremium();
            //new variable that stores the current premium with the 5% increase and then adds it back into the array
            double newPremium = currentPremium * 1.05;
            policy.setPremium(newPremium);
        }

        System.out.println("Premiums increased by 5% for all policies in the system for this year. ");
    }

    public double getTotalPremium() {
        // stores the total premium amount
        double totalPremium = 0.0;
        //runs through array to get the premium of all policies
        for(Policy policy : policies){
            // adds the left hand variable with right hand variable
            totalPremium += policy.getPremium();
        }
        return totalPremium;
    }

    public static void main(String[] args) {
        InsuranceSystem insuranceSystem = new InsuranceSystem();

        // Creates 1 driver and 1 car
        Driver driver1 = new Driver("872342", "John Doe", 5, "123-456-7890");
        Car car1 = new Car("D11", 2021, 2.0, true);

        Driver driver2 = new Driver("239742", "John Brown", 9, "123-456-7890");
        Car car2 = new Car("D13", 2021, 2.0, true);
        // Adds the driver and car 
        insuranceSystem.addDriver(driver1);
        insuranceSystem.addCar(car1);

        insuranceSystem.addDriver(driver2);
        insuranceSystem.addCar(car2);
        // Creates a policy
        insuranceSystem.createPolicy(driver1, car1, 1000.0);
        insuranceSystem.createPolicy(driver2, car2, 1500.0);

        // Attempt to create a policy with an non qualifying driver
        Driver driver3 = new Driver("15345", "Jane Smith", 15, "987-654-3210");
        insuranceSystem.createPolicy(driver3, car1, 1200.0);

        //increase premiums annual function
        insuranceSystem.premiumsAnually();

        // delete a policy
        insuranceSystem.deletePolicy(1);

        //total amount made from premiums
        double totalPremium = insuranceSystem.getTotalPremium();
        System.out.println("The total premium amount is : " + totalPremium);
    }
}

public abstract class AbstractCar implements Car {

    protected final String registrationNumber;
    protected final String make;
    protected final String model;
    protected final int numberOfDoors;

    public AbstractCar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return "Bil: " + getMake() + " " + getModel() + " " + getNumberOfDoors() + " " + getRegistrationNumber() + "\nAfgift: " + getRegistrationFee();
    }

}

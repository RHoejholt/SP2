public abstract class AbstractFuelCar extends AbstractCar {
    private final int kmPrLitre;

    public AbstractFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType();

    public int getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBrændstof type: " + getFuelType();
    }
}

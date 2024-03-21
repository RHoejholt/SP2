public abstract class AFuelCar extends ACar{
    protected final int kmPrLitre;
    private String fuelType;


    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPerLitre = kmPerLitre;
    }
    abstract public String getFuelType();

    public int getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString(){}

    public int getRegistrationFee(){return null;}




}

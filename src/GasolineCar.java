public class GasolineCar extends AFuelCar{

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public int getRegistrationFee() {
            if(getKmPrLitre() >= 20 && getKmPrLitre()  < 50) {
                return 330;
            } else if (getKmPrLitre()  > 15) {
                return 1050;
            } else if (getKmPrLitre()  > 10) {
                return 2340;
            } else if (getKmPrLitre()  > 5) {
                return 5500;
            } else if (getKmPrLitre()  > 0) {
                return 10470;
            }else {
                System.out.println("Bilen skal have en km/l mellem 0 og 50.");
                return 0;
            }
    }

    public String getFuelType(){
        return "Gasoline";
    }

    @Override
    public String toString(){
        return "";
    }
}


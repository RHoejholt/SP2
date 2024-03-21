public class DieselCar extends AFuelCar{
    boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }


    public boolean hasParticleFilter(){
        return particleFilter;
    }


    public int getRegistrationFee() {
        int fee;
        if(getKmPrLitre() >= 20 && getKmPrLitre()  < 50) {
            fee =  460;
        } else if (getKmPrLitre()  > 15) {
            fee =  2440;
        } else if (getKmPrLitre()  > 10) {
            fee = 2340 + 1850;
        } else if (getKmPrLitre()  > 5) {
            fee = 5500 + 2770;
        } else if (getKmPrLitre()  > 0) {
            fee = 10470 + 15260;
        }else {
            System.out.println("FEJL! Bilen skal have en km/l mellem 0 og 50.");
            fee = 0;
        }
        if(!hasParticleFilter()){
            fee+=1000;
        }
        return fee;
    }

    public String getFuelType(){
        return "Diesel";
    }

    @Override
    public String toString(){
        return "";
    }

}

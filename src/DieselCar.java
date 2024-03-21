public class DieselCar extends AFuelCar{
    boolean particleFilter;



    public boolean hasParticleFilter(){
        return;
    }

    @Override
    public int getRegistrationFee(Car car) {
        int fee;
        if(car.getKmPrLitre() >= 20 && car.getKmPrLitre()  < 50) {
            fee =  460;
        } else if (car.getKmPrLitre()  > 15) {
            fee =  2440;
        } else if (car.getKmPrLitre()  > 10) {
            fee = 2340 + 1850;
        } else if (car.getKmPrLitre()  > 5) {
            fee = 5500 + 2770;
        } else if (car.getKmPrLitre()  > 0) {
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
        return fuelType;
    }

    @Override
    public String toString(){
        return;
    }
}

public class GasolineCar extends AFuelCar{

    @Override
    public int getRegistrationFee(Car car) {
            if(car.getKmPrLitre() >= 20 && car.getKmPrLitre()  < 50) {
                return 330;
            } else if (car.getKmPrLitre()  > 15) {
                return 1050;
            } else if (car.getKmPrLitre()  > 10) {
                return 2340;
            } else if (car.getKmPrLitre()  > 5) {
                return 5500;
            } else if (car.getKmPrLitre()  > 0) {
                return 10470;
            }else {
                System.out.println("Bilen skal have en km/l mellem 0 og 50.");
                return 0;
            }
    }

    public String getFuelType(){
        return fuelType;
    }

    @Override
    public String toString(){
        return;
    }
}


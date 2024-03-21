public class ElectricCar extends ACar{
    int batteryCapacity;
    int maxRange;
    int whPrKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange, int whPrKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.whPrKm = whPrKm;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getWhPrKm(){
        return whPrKm();
    }


    public int getRegistrationFee(Car eCar) {
        float kmPrLitre = (float)(eCar.getWhPrKm()/91.25)/100;
        if(kmPrLitre >= 20 && kmPrLitre < 50) {
            return 330;
        } else if (kmPrLitre > 15) {
            return 1050;
        } else if (kmPrLitre > 10) {
            return 2340;
        } else if (kmPrLitre > 5) {
            return 5500;
        } else if (kmPrLitre > 0) {
            return 10470;
        }else {
            System.out.println("Bilen skal have en km/l mellem 0 og 50.");
            return 0;
        }
    }
}

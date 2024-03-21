public class ElectricCar extends ACar {
    private final int batteryCapacity;
    private final int maxRange;
    private final double whPrKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.whPrKm = (double) batteryCapacity / maxRange;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public double getWhPrKm() {
        return whPrKm;
    }


    public int getRegistrationFee() {
        double kmPrLitre = 100 / (getWhPrKm() / 91.25);
        if (20 < kmPrLitre && kmPrLitre < 50) {
            return 330;
        } else if (kmPrLitre > 15) {
            return 1050;
        } else if (kmPrLitre > 10) {
            return 2340;
        } else if (kmPrLitre > 5) {
            return 5500;
        } else if (kmPrLitre > 0) {
            return 10470;
        } else {
            System.out.println("Bilen skal have en km/l mellem 0 og 50.");
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nBrændstof type: Elbil" + "\nKm pr. Wh: " + getWhPrKm() + "\nDistance på en fuld opladning: " + getMaxRangeKm();
    }
}

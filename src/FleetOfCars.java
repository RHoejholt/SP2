import java.util.ArrayList;
import java.util.List;

public class FleetOfCars {
    private final List<Car> fleet = new ArrayList<>();

    void addCar(Car car) {
        fleet.add(car);
    }

    int getTotalRegistrationFeeForFleet() {
        int total = 0;
        for (Car c : fleet) {
            total += c.getRegistrationFee();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder total = new StringBuilder();
        for (Car c : fleet) {
            total.append("\n--------------\n").append(c.toString());
        }
        return total.toString();
    }


}

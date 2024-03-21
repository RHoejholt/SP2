//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FleetOfCars bestilling1 = new FleetOfCars();

        GasolineCar car1 = new GasolineCar("AB279823", "Honda", "Civic", 5, 19);
        ElectricCar car2 = new ElectricCar("AC732039", "Tesla", "Model X", 5, 90, 600);
        DieselCar car3 = new DieselCar("AD237392", "Citroen", "C3", 5, 21);
        bestilling1.addCar(car1);
        bestilling1.addCar(car2);
        bestilling1.addCar(car3);

        System.out.println(bestilling1);
        System.out.println("\nTotal afgift for bestilling: " + bestilling1.getTotalRegistrationFeeForFleet());
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GasolineCar car1 = new GasolineCar("AB279823", "Honda", "Civic", 5, 19);
        System.out.println(car1);

        ElectricCar car2 = new ElectricCar("AC732039", "Tesla", "Model X", 5, 90, 600);
        System.out.println(car2);

        DieselCar car3 = new DieselCar("AD237392", "Citroen", "C3", 5, 21);
        System.out.println(car3);

    }
}
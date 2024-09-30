import model.Car;
import model.Patient;
import model.Airplane;
import model.Vehicle;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setFirstName("john");
        System.out.println(patient.getFirstName());
        Patient patient1 = new Patient();
        patient1.setFirstName("Clara");
        /** Vehicle vehicle = new Vehicle();
         * is not allowed because Vehicle is abstract
         */

        Vehicle vehicle = new Car();
        vehicle.setChassisNumber("87UHY678");
        /**  vehicle.setBrand("a brand");
         * is not allowed because vehicle doesn't have this setter
         */

        Car car = new Car();
        car.setModel("a model");
        System.out.println(car.getModel());
        car.setChassisNumber("ERF456");
        Airplane airplane = new Airplane();
        airplane.setChassisNumber("ERT54678UY");
    }
}
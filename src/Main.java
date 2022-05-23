public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("Very Special Chinese Bicycle Model", 17);
        System.out.println("bicycle = " + bicycle);

        Car car = new Car("Mercedes", 4);
        System.out.println("car = " + car);

        Truck truck = new Truck("Volvo", 12);
        System.out.println("truck = " + truck);


        bicycle.check();
        car.check();
        truck.check();

    }
}
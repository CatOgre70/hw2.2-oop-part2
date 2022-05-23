public class ServiceStation {
    public void check(Bicycle bicycle){
        if(bicycle != null){
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre(i+1);
            }
            if(bicycle.getClass().getName().equals("Car")) {
                Car car = (Car)bicycle;
                car.checkEngine();
            } else if(bicycle.getClass().getName().equals("Truck")) {
                Truck truck = (Truck)bicycle;
                truck.checkEngine();
                truck.checkTrailer();
            }
        }
    }
}

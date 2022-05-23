public class Truck extends Car{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "modelName='" + super.getModelName() + '\'' +
                ", wheelsCount=" + super.getWheelsCount() +
                '}';
    }
}

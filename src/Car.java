import java.util.Objects;

public class Car extends Bicycle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + super.getModelName() + '\'' +
                ", wheelsCount=" + super.getWheelsCount() +
                '}';
    }
}

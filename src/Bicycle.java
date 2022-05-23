import java.util.Objects;

public class Bicycle extends Transport{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "modelName='" + super.getModelName() + '\'' +
                ", wheelsCount=" + super.getWheelsCount() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return super.getWheelsCount() == bicycle.getWheelsCount() && super.getModelName().equals(bicycle.getModelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getModelName(), super.getWheelsCount());
    }

    public void check() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre(i + 1);
        }
    }

}

import java.util.Objects;

public abstract class Transport {
    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void updateTyre(int i){
        System.out.println("Меняем покрышку " + i + " из " + this.wheelsCount);
    }

    public abstract void check();

}

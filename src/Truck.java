public class Truck extends Transport{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine(){System.out.println("Проверяем двигатель");}

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

    public void check(){
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre(i+1);
        }
        this.checkEngine();
        this.checkTrailer();

    }

}

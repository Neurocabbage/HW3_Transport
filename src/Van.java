public class Van extends Automobile {
    private double loadCapacity;

    public Van(int year, int speed, double weight, String motorType, int maxPower, double loadCapacity) {
        super(year, speed, weight, motorType, maxPower);
        this.loadCapacity = loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Van{" +
                "loadCapacity=" + loadCapacity + " kg" +
                '}';
    }

}

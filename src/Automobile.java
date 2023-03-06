public class Automobile extends Transport {
    private int maxPower;
    public Automobile(int year, int speed, double weight, String motorType, int maxPower) {
        super(year, speed, weight, motorType);
        this.maxPower = maxPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Automobile {" +
                "maxPower= " + maxPower + " hp" +
                '}';
    }
}

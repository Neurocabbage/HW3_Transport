public class Bus extends Automobile {
    private int passengerCapacity;

    public Bus(int year, int speed, double weight, String motorType, int maxPower,
               int passengerCapacity) {
        super(year, speed, weight, motorType, maxPower);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Bus {" +
                "passengerCapacity=" + passengerCapacity +
                '}';
    }
}

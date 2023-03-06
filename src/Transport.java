public class Transport {
    private int year;
    private int speed;
    private double weight;
    private String motorType;


    public Transport(int year, int speed, double weight,
                     String motorType) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.motorType = motorType;
    }

    @Override
    public String toString() {
        return "Transport {" +
                "year=" + year +
                ", speed=" + speed +
                " km/h, weight=" + weight +
                " t, motorType='" + motorType + '\'' +
                '}';
    }
}


package Eleventh.Homework;
class Aeroplane{
    private String vehicle;
    private String Fly;
    private int wheelNum;

    public Aeroplane(String vehicle, String fly, int wheelNum) {
        this.vehicle = vehicle;
        Fly = fly;
        this.wheelNum = wheelNum;
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getFly() {
        return Fly;
    }

    public int getWheelNum() {
        return wheelNum;
    }

    @Override
    public String toString() {
        return "aeroplane{" +
                "vehicle='" + vehicle + '\'' +
                ", Fly='" + Fly + '\'' +
                ", wheelNum=" + wheelNum +
                '}';
    }
}
class Car extends Aeroplane{
    private String colour;

    public Car(String vehicle, String fly, int wheelNum, String colour) {
        super(vehicle, fly, wheelNum);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "car{" +
                "vehicle="+ super.getVehicle()+
                ", fly="+ super.getFly()+
                ", wheelNum="+ super.getWheelNum()+
                ", colour=" + colour +

                '}';
    }
}
public class Vehicles {
    public static void main(String[] args) {
        Aeroplane ap = new Aeroplane("vehicle", "flying", 22);
        System.out.println(ap);
        Car c = new Car("vehicle","No",4,"red");
        System.out.println(c);

    }
}

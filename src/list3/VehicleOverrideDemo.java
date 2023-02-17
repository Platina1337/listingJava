package list3;

class Vehicle8 {
    public String toString() {
        return "Vehicle8(passengers=" + passengers + ";" +
                "wheels=" + wheels + ";" +
                "maxspeed=" + maxspeed + ";" +
                "burnup=" + burnup +
                ")";
    }
}
class Auto extends Vehicle {
    boolean sunroof;
    Auto(boolean sunroof) {
        this(4, 4, 200,12, sunroof);
    }
    Auto(int f, int g, int h, int j, boolean sunroof) {
        super(f,g,h,j);
        this.sunroof = sunroof;
    }
}

public class VehicleOverrideDemo {
    public static void main(String[] args) {
        Vehicle8 v = new Vehicle8 (2, 2, 100, 9);
        Auto a = new Auto(2, 4, 180, 12, true);
        System.out.println("Vehicle8.toString(): " + v.toString());
        System.out.println("Auto.toString(): " + a.toString());
    }
}

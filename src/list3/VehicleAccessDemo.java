package list3;

class VehicleAccess {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    VehicleAccess(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
    double distance (double interval) {
        double val = this.maxspeed * interval;
        return val;
    }
}
class VehicleAccessDemo {

    public static void main (String[] args) {
        VehicleAccess ferrari = new VehicleAccess(2, 4, 360, 12);
        double distance = ferrari.distance(0.5);
        System.out.println("Ferrari за полчаса проедет " +  distance + "км.");
        System.out.println("Скорость Ferrari: " + ferrari.maxspeed + "км/ч");
    }
}

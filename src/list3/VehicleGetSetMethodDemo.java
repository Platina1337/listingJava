package list3;

class VehicleGetSetMethodDemo {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    VehicleGetSetMethodDemo(int passengers , int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    }
    int getMaxSpeed() {
        return this.maxspeed;
    }
    int getWheels() {
        return this.wheels;
    }
    void setWheels(int wheels) {
        if ((wheels < 1) || (wheels > 24)) {
            System.out.println("Неверно указано число колес.");
            return;
        }
        this.wheels = wheels;
    }
}
class VehicleGetSetMethod {
    public static void main(String[] args) {

        VehicleGetSetMethodDemo ferrari = new VehicleGetSetMethodDemo(2, -2, 360, 12);

        System.out.println("max скорость: " + ferrari.getMaxSpeed() + "км/ч");

        System.out.println("Число колес " + ferrari.getWheels());

        ferrari.setWheels(4);

        System.out.println("Число колес (повторное) : " + ferrari.getWheels());
    }
}

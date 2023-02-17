package list3;

class Vehicle3 {
    int passengers;
    int wheels;
    int manspeed;
    int burnup;
        Vehicle3 (int p, int w, int ms, int bu) {
        passengers = p;
        wheels = w;
        manspeed = ms;
        burnup = bu;
    }

    double distance(double interval) {
        double value = manspeed * interval;
        return value;
    }
}

class VehicleConstrDemo {
    public static void main(String[] args) {
        Vehicle3 car = new Vehicle3(2, 4, 130, 30);
        Vehicle3 bus = new Vehicle3(45, 4, 120, 25);

        double interval = 1;
        double distanceCar = car.distance(interval);
        double distanceBus = bus.distance(interval);

        System.out.println("Автомобиль с " + car.passengers + "пассажирами" + "проедет за 1 час " + distanceCar + "км." );
        System.out.println("Автобус с " + bus.passengers + "пассажирами" + "проедет за 1 час " + distanceBus + "км." );
    }
}

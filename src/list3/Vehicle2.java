package list3;

 class Vehicle6 {
     int passangers;
     private int wheels;
     private int maxspeed;
     int burnup;
     Vehicle6(){
         this(4, 4, 160, 13);
     }
Vehicle6(int passangers, int wheels, int maxspeed, int burnup){
         this.passangers = passangers;
         this.wheels = wheels;
         this.maxspeed = maxspeed;
         this.burnup = burnup;
}
   double distance (int interval){
         return distance((double) interval);
   }
    double distance (double interval){
    double value = this.maxspeed * interval;
    return value;
     }
     }

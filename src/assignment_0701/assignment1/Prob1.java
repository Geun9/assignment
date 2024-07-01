package assignment_0701;

public class Prob1 {
    public static void main(String[] args) {
        Truck truck = new Truck("트럭", 100, 4);
        Bike bike = new Bike("자건거", 25, 2);

        truck.getWheelNumber(truck);
        bike.getWheelNumber(bike);

        System.out.println();

        truck.getVelocity(truck);
        bike.getVelocity(bike);

        System.out.println();

        truck.speedDown(13);
        bike.speedDown(15);

        System.out.println();

        truck.stop();
        bike.stop();

        System.out.println();

        truck.speedUp(10);
    }
}

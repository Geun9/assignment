package assignment_0702.assignment1;

public abstract class Animal {
    int speed;
    static double distance;

    Animal() {

    }

    Animal(int speed) {
        this.speed = speed;
    }

    abstract void run(int hours);

    double getDistance() {
        return this.distance;
    }

}

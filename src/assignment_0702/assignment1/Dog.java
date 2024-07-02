package assignment_0702.assignment1;

public class Dog extends Animal{
    Dog() {

    }

    Dog(int speed) {
        this.speed = speed;
    }

    @Override
    void run(int hours) {
        distance = speed * 0.5 * hours;
    }
}

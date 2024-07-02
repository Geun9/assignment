package assignment_0702.assignment1;

public class Chicken extends Animal implements Cheatable{

    Chicken() {

    }

    Chicken(int speed) {
        this.speed = speed;
    }
    @Override
    void run(int hours) {
        distance = speed * hours;
    }

    @Override
    public void fly() {
        this.speed *= 2;
    }
}

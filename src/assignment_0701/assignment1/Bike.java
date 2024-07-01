package assignment_0701.assignment1;

public class Bike extends Wheeler{

    static final int maxSpeed = 40;
    static final int minSpeed = 10;
    Bike() {

    }

    Bike(String carName, int velocity, int wheelNumber) {
        super(carName, velocity, wheelNumber);
    }

    @Override
    public void speedUp(int speed) {
        if (this.velocity + speed > maxSpeed) {
            this.velocity = maxSpeed;
            isMaximumSpeedViolated(this.carName, this.velocity);
        } else {
            this.velocity += speed;
            getVelocity(this.carName, this.velocity);
        }
    }

    @Override
    public void speedDown(int speed) {
        if (this.velocity - speed < minSpeed) {
            this.velocity = minSpeed;
            isMinimumSpeedViolated(this.carName, this.velocity);
        } else {
            this.velocity -= speed;
            getVelocity(this.carName, this.velocity);
        }
    }
}

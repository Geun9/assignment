package assignment_0701;

public class Truck extends Wheeler {

    static final int maxSpeed = 100;
    static final int minSpeed = 50;

    Truck() {

    }

    Truck(String carName, int velocity, int wheelNumber) {
        super(carName, velocity, wheelNumber);
    }

    @Override
    public void speedUp(int speed) {
        int currentVelocity = this.velocity + (speed * 5);
        if (currentVelocity > maxSpeed) {
            this.velocity = maxSpeed;
            isMaximumSpeedViolated(this.carName, this.velocity);
        } else {
            this.velocity = currentVelocity;
            getVelocity(this.carName, this.velocity);
        }
    }

    @Override
    public void speedDown(int speed) {
        int currentVelocity = this.velocity - (speed * 5);
        if (currentVelocity < minSpeed) {
            this.velocity = minSpeed;
            isMinimumSpeedViolated(this.carName, this.velocity);
        } else {
            this.velocity = currentVelocity;
            getVelocity(this.carName, this.velocity);
        }
    }


}

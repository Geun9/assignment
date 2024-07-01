package assignment_0701.assignment1;

public abstract class Wheeler {
    protected int velocity;
    protected String carName;
    protected int wheelNumber;

    Wheeler() {

    }

    Wheeler(String carName, int velocity, int wheelNumber) {
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    abstract public void speedUp(int speed);

    abstract public void speedDown(int speed);

    public void stop(){
        velocity = 0;
        System.out.println("정지 상태로 속도를 0으로 초기화합니다.");
    }

    public int getVelocity() {
        return velocity;
    }

    public String getCarName() {
        return carName;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void getWheelNumber(Wheeler wheeler) {
        System.out.println(wheeler.getCarName() + " : 바퀴 " + wheeler.getWheelNumber() + "개입니다.");
    }

    public void getVelocity(Wheeler wheeler) {
        System.out.println(wheeler.getCarName() + "의 현재 속도는 " + wheeler.getVelocity() + " 입니다.");
    }

    public void getVelocity(String carName, int velocity) {
        System.out.println(carName + "의 현재 속도는 " + velocity + " 입니다.");
    }

    public void isMaximumSpeedViolated(String carName, int velocity) {
        System.out.println(carName + "의 최고 속도 위반으로 속도를 " + velocity + "으로 내립니다.");
    }

    public void isMinimumSpeedViolated(String carName, int velocity) {
        System.out.println(carName + "의 최저 속도 위반으로 속도를 " + velocity + "으로 올립니다.");
    }
}


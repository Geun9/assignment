package assignment_0702.assignment2;

public class TVFactory extends Factory implements IWorkingTogether{

    TVFactory() {

    }

    TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        int num;

        switch (skill) {
            case 'A' -> num = 8;
            case 'B' -> num = 5;
            case 'C' -> num = 3;
            default -> num = 1;
        }

        return num * getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return makeProducts('C');
    }
}

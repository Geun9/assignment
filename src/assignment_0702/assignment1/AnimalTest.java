package assignment_0702.assignment1;

public class AnimalTest {

    public static void main(String[] args) {
        Animal dog = new Dog(8);
        Animal chicken = new Chicken(3);
        Chicken cheatableChicken = new Chicken(5);
        cheatableChicken.fly();

        if (chicken instanceof Cheatable cheatable) {
            for(int i = 1; i <= 3; i++) {
                System.out.println(i + "시간 후");

                dog.run(i);
                System.out.println("개의 이동 거리 = " + dog.getDistance());
                chicken.run(i);
                System.out.println("닭의 이동 거리 = " + chicken.getDistance());
                cheatableChicken.run(i);
                System.out.println("날으는 닭의 이동 거리 = " + cheatableChicken.getDistance());
            }
        }
    }
}
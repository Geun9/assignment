package assignment_0701.assignment3_1;

public class Coffee extends Beverage {

    public static int amount = 0;
    private static final int americano = 1500;
    private static final int cafeLatte = 2500;
    private static final int cappuccino = 3000;

    {
        amount++;
    }

    public Coffee() {
    }

    public Coffee(String name) {
        super(name);
        calcPrice();
    }

    @Override
    void calcPrice() {
        if (this.getName().toUpperCase().equals("AMERICANO")) {
            setPrice(americano);
        } else if (this.getName().toUpperCase().equals("CAFELATTE")) {
            setPrice(cafeLatte);
        } else if (this.getName().toUpperCase().equals("CAPPUCCINO")) {
            setPrice(cappuccino);
        } else {
            System.out.println("존재하지 않는 메뉴입니다.");
        }
    }
}

package assignment_0701.assignment3_1;

public class Tea extends Beverage{

    public static int amount = 0;
    private static final int lemonTea = 1500;
    private static final int ginsengTea =2000;
    private static final int redginsengTea = 2500;

    {
        amount++;
    }
    public Tea() {

    }

    public Tea(String name) {
        super(name);
        calcPrice();
    }

    @Override
    void calcPrice() {
        if (this.getName().toUpperCase().equals("LEMONTEA")) {
            setPrice(lemonTea);
        } else if (this.getName().toUpperCase().equals("GINSENGTEA")) {
            setPrice(ginsengTea);
        } else if (this.getName().toUpperCase().equals("REDGINSENGTEA")) {
            setPrice(redginsengTea);
        } else {
            System.out.println("존재하지 않는 메뉴입니다.");
        }
    }
}

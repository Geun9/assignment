package assignment_0701.assignment3_1;

public abstract class Beverage {
    private String name;
    private int price;

    public Beverage() {

    }

    public Beverage(String name) {
        this.name = name;
    }

    abstract void calcPrice();

    public void print(int num) {
        System.out.println(num + 1 + "번째 판매 음료는 " + this.name + "이며, 가격은 " + this.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

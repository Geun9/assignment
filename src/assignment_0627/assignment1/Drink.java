package assignment_0627.assignment1;

public class Drink {
    String name;
    int price;
    int count;

    Drink() {}

    Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    int getTotalPrice() {
        return this.price * this.count;
    }

    static void printTitle() {
        System.out.println("상품명\t단가\t\t\t수량\t\t금액");
    }

    void printData() {
        System.out.println(this.name + "\t\t" + this.price + "\t\t" + this.count + "\t\t\t" + this.getTotalPrice());
    }

}

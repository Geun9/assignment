package assiggnment_0627.q1;

public class Alcohol extends Drink{
    double alcper;

    Alcohol() {}

    Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }

    static void printTitle() {
        System.out.println("상품명(도수[%])\t단가\t\t\t수량\t\t금액");
    }

    @Override
    void printData() {
        System.out.printf("%s(%.1f)\t\t\t%d\t\t%d\t\t\t%d\n", this.name, this.alcper, this.price, this.count, super.getTotalPrice());
    }
}

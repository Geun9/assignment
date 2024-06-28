package assiggnment_0627.q1;

public class Prob1 {

    public static void main(String[] args) {
        Drink drink1 = new Drink("커피", 1500, 4);
        Drink drink2 = new Drink("녹차", 1100, 7);
        Drink alcohol1 = new Alcohol("와인", 5000, 3, 15.1);

        System.out.println("***** 매출전표 *****");
        drink1.printTitle();
        drink1.printData();
        drink2.printData();
        System.out.println();

        alcohol1.printTitle();
        alcohol1.printData();

        System.out.printf("\n*** 총금액 %d원 ***\n", drink1.getTotalPrice() + drink2.getTotalPrice() + alcohol1.getTotalPrice());
    }
}

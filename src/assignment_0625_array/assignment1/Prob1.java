package assignment_0625_array.assignment1;

public class Prob1 {
    public static void main(String[] args) {

        int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
        int[] ib = new int[]{1, 2, 3, 4, 5};

        int iaOdd = 0;
        int iaEven = 0;
        int ibOdd = 0;
        int ibEven = 0;

        for (int i = 0; i < ia.length; i++) {
            if (ia[i] % 2 == 0) {
                iaEven += ia[i];
            } else {
                iaOdd += ia[i];
            }
        }

        System.out.println("( 배열ia )");
        System.out.println("홀수의 합 : " + iaOdd);
        System.out.println("짝수의 합 : " + iaEven);

        for (int i = 0; i < ib.length; i++) {
            if (ib[i] % 2 == 0) {
                ibEven += ib[i];
            } else {
                ibOdd += ib[i];
            }
        }

        System.out.println("( 배열ib )");
        System.out.println("홀수의 합 : " + ibOdd);
        System.out.println("짝수의 합 : " + ibEven);

    }
}

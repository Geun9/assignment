package assignment_0625_array.assignment2;

public class Exam01_0625 {
    public static void main(String[] args) {

        // 1. 배열 선언
        int[] intArray = {10, 30, 20, 80, 50};
        double[] doubleArr = new double[intArray.length];
        String[] starArr = new String[intArray.length];
        double total = 0;
        String star = "*";


        // 2. intArray 총합
        for (int num : intArray) {
            total += num;
        }


        // 3. 배열의 비율 구하기
        for (int i = 0; i < intArray.length; i++) {
            doubleArr[i] = (intArray[i] / total) * 100;
            starArr[i] = star.repeat((int) doubleArr[i]);
        }


        // 4. *을 이용하여 비율 표현
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(starArr[i] + " (" + doubleArr[i] + ")");
        }


    }
}

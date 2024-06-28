package assignment_0625_array.assignment1;

import java.util.Random;

public class ArrayExam02 {
    public static void main(String[] args) {
        Random random = new Random();
        // 1) 생성할 배열은 int 타입이며, 개수는 5개입니다.
        int[] array = new int[5];

        // 2) 1부터 100 사이의 난수를 발생시켜 배열 원소들을 초기화 합니다. - Random클래스를 nextInt(정수)를 이용
        // random.nextInt(100) => 0 ~ 99 ; 0부터 100 미만의 정수
        // random.nextInt(100) + 1 => 1 ~ 100
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(100) + 1);
            System.out.printf("%d ", array[i]);
        }
    }
}

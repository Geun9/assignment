package assignment_week3_array.assignment3;

public class Prob2 {
	public static void main(String[] args){
		Prob2 p = new Prob2();
		int[] numbers = p.generateRandom();
		int maxNumber = 0;

		System.out.println("<< 생성된 난수 >>");
		for (int number : numbers) {
			System.out.printf("%d, ",number);
		}

		System.out.println("\n==========================");
		maxNumber = p.getMaxNum(numbers);
		System.out.println("배열에서 가장 큰 숫자 : " + maxNumber);
	}
	public int[] generateRandom() {
		int[] randomArray = new int[10];
		for (int i = 0; i < 10; i++) {
			randomArray[i] = (int) ((Math.random() * 30) + 1);
		}

		return randomArray;
	}

	public int getMaxNum(int[] inputNumbers) {
		int max = 0; //

		for (int inputNumber : inputNumbers) {
			max = max > inputNumber ? max : inputNumber;
		}
		return max;
	}
}

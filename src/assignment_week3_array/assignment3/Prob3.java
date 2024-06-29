package assignment_week3_array.assignment3;

public class Prob3 {
	public static void main(String[] args) {
		int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
		System.out.println("<< 중복되지 않은 숫자 >>");
		printUniqueNumber(array);
	}

	private static void printUniqueNumber(int[] array) {
		// int[]일 때는 0으로 초기화 되어, 0인 중복값 체크 불가
		String[] arrayCopy = new String[array.length];
        for (int i = 0; i < array.length; i++) {
			int cnt = 0;
			for (int j = 0;j < arrayCopy.length; j++) {
				if (Integer.toString(array[i]).equals(arrayCopy[j])) {
					break;
				}
				cnt++;
			}
			if (cnt == array.length)
				arrayCopy[i] = Integer.toString(array[i]);
        }

		for (String arr : arrayCopy) {
			if (arr != null) {
				System.out.printf("%d ", Integer.parseInt(arr));
			}
		}
	}
}

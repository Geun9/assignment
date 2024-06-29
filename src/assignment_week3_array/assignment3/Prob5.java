package assignment_week3_array.assignment3;

public class Prob5 {
	public static int getValue(int[] values, boolean isMax) {
        // checkNum = 0 으로 초기화 시, 최소값 확인 불가
		int checkNum = values[0];

        // isMax == true; 최대값 / isMax == false; 최소값
        if (isMax) {
            for (int value : values) {
                checkNum = checkNum > value ? checkNum : value;
            }
        } else {
            for (int value : values) {
                checkNum = checkNum > value ? value : checkNum;
            }
        }

        return checkNum;
	}

	public static void main(String[] args) {
		int[] values = {57, 3, 43, 5, 39, 23, 55, 2};

		int maxValue = getValue(values, true);
		int minValue = getValue(values, false);

		System.out.println("최대값 = " + maxValue);
		System.out.println("최소값 = " + minValue);

	}
}

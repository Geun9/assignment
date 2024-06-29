package assignment_week3_array.assignment3;

public class Prob7 {
	public static void main(String[] args) throws Exception {
		Prob7 calculateRates = new Prob7();

		// 비율 결과: 5.0%, 16.0%, 11.0%, 42.0%, 26.0%
		calculateRates.calculate(new int[] { 10, 30, 20, 80, 50 });

		// 비율 결과: 20.0%, 20.0%, 20.0%, 20.0%, 20.0%
		calculateRates.calculate(new int[] { 50, 50, 50, 50, 50 });

		// 비율 결과: 7.0%, 13.0%, 20.0%, 27.0%, 33.0%
		calculateRates.calculate(new int[] { 1, 2, 3, 4, 5 });
	}

	public void calculate(int[] nums) throws Exception {
		int total = 0;
        double[] ratios = new double[nums.length];
        String star = "*";

        // 1.  비율 구하기
        for (int num : nums) {
            total += num;
        }

        for (int i = 0; i < ratios.length; i++) {
            ratios[i] = Math.round(((double) nums[i] / total) * 100);
        }

        // 2. *로 비율 표현
		for (double ratio : ratios) {
			System.out.print(star.repeat((int) ratio));
			System.out.printf(" (%.1f%%)\n", ratio);
		}
	}
}
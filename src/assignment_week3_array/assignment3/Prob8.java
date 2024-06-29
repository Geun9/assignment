package assignment_week3_array.assignment3;

import java.util.Arrays;

public class Prob8 {
	public static void main(String[] args){
		Prob8 sort = new Prob8();
		int[][] arrays = {
			{5, 4, 3, 2, 1},
			{10, 9, 8, 7, 6},
			{15, 14, 13, 12, 11},
			{20, 19, 18, 17, 16},
			{25, 24, 23, 22 ,21}
		};

		sort.ascending(arrays);
	}
	public void ascending(int[][] inputNumbers) {
     // implements ascending method.
		for (int i = 0; i  < inputNumbers.length; i++) {
			int sortNumbers[] = Arrays.stream(inputNumbers[i]).sorted().toArray();
			for (int sortNumber : sortNumbers) {
				System.out.printf("%-5d", sortNumber);
			}
			System.out.println();
		}
	}
}

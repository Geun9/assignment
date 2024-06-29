package assignment_week3_array.assignment3;

import java.util.Arrays;

public class Prob6 {

	public static void main(String[] args) {
		Prob6 median = new Prob6();

		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : "+ Arrays.toString(values1));
		System.out.println("median : "+median.findMedian(values1));
		System.out.println("=================================================");

		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : "+Arrays.toString(values2));
		System.out.println("median : "+median.findMedian(values2));
	}

	public int findMedian(int[] values) {
        int total = 0;
        double avg;
        double avgAbsDiffs[] = new double[values.length];
        double minAvgAbsDiff;
        String medianValues[] = new String[values.length];
        int minMedianValue = 0;

        // 1. 평균 구하기
        for (int value : values) {
            total += value;
        }
        avg = (double) total / values.length;

        // 2. values와 평균의 차이를 절대값으로 구하기: avgAbsDiffs 
        for (int i = 0; i < values.length; i++) {
            avgAbsDiffs[i] = Math.abs(avg - (double) values[i]);
        }

        // 3. avgAbsDiffs 중 최소값 구하기: minAvgAbsDiff
        minAvgAbsDiff = avgAbsDiffs[0];
        for (double avgAbsDiff : avgAbsDiffs) {
            minAvgAbsDiff = minAvgAbsDiff > avgAbsDiff ? avgAbsDiff : minAvgAbsDiff;
            
        }
        
        // 4. 임시 중간 값 구하기: medianValues -> 중간 값이 0일 경우를 대비해 String[] (int[]은 0으로 초기화)
        for (int i = 0; i < values.length; i++) {
            if (avgAbsDiffs[i] == minAvgAbsDiff) {
                medianValues[i] = Integer.toString(values[i]);
            }
        }
        
        // 5. 임시 중간 값들 중 작은 값 구하기

        // 5-1. 최소값 초기화
        for (String medianValue : medianValues) {
            if (medianValue != null) {
                minMedianValue = Integer.parseInt(medianValue);
                break;
            }
        }

        for (String medianValue : medianValues) {
            if (medianValue != null) {
                minMedianValue = Integer.parseInt(medianValue) > minMedianValue ? minMedianValue
                    : Integer.parseInt(medianValue);
            }
        }

        return minMedianValue;
	}
}

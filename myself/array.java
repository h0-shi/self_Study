package myself;

import java.util.*;

public class array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 배열 길이 정하기
//		System.out.println("배열의 크기");
//		int count = sc.nextInt();
//		int[] a = new int [count];
//		
//		//배열에 값 입력
//		for(int i = 0; i < count; i++) {
//		int input = sc.nextInt();
//		a[i] = input;
//		}		
//				
//		Arrays.sort(a);

		int[] ary = { 1, 7, 10, 52, 2, 4 };
		Arrays.sort(ary);

		/** 두 수 사이의 차 구하는 배열 생성*/
		int[] aryDifference = new int[ary.length - 1];
		int temp = 0;
		for (int i = 0; i < ary.length; i++) {
			if (i + 1 < ary.length) {
				temp = ary[(i + 1)] - ary[i];
				aryDifference[i] = temp;
			}
		}

		/** 배열에서 최솟값 구하기*/
		int min = aryDifference[0];
		for (int i = 0; i < aryDifference.length; i++) {
			if (min > aryDifference[i]) {
				min = aryDifference[i];
			}
		}

		/** 최솟값의 위치 찾기 */
		for (int i = 0; i < aryDifference.length; i++) {
			if (aryDifference[i] == min) {
				temp = i;
			}
		}
		System.out.println(ary[temp] + "과 " + ary[temp + 1] + "이(가) 가장 가깝습니다.");
	}
}
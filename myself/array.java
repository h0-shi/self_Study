package myself;

import java.util.*;

public class array {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
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

// 배열에서 가장 가까운 값 찾기		
		int[] ary = { 1,3,4,8,17,20 };
		Arrays.sort(ary);

		// 두 수 사이의 차 구하는 배열 생성
		int[] aryDifference = new int[ary.length - 1];
		for (int i = 0; i < ary.length; i++) {
			if (i + 1 < ary.length) { 
				aryDifference[i] = ary[(i + 1)] - ary[i];
			}
		}

		// 새로 만든 배열에서 최솟값 구하기
		int min = aryDifference[0];
		for (int i = 0; i < aryDifference.length; i++) {
			if (min > aryDifference[i]) {
				min = aryDifference[i];
			}
		}

		// 최솟값의 위치 찾기 
		int idx = 0;
		for (int i = 0; i < aryDifference.length; i++) {
			if (aryDifference[i] == min) {
				idx = i;
			}
		}
		System.out.println(ary[idx] + "과 " + ary[idx + 1] + "이(가) 가장 가깝습니다.");
	}
}
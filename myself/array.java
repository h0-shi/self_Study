package myself;

import java.util.*;

public class array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//배열 길이 정하기
		System.out.println("배열의 크기");
		int count = sc.nextInt();
		int[] a = new int [count];
		
		//배열에 값 입력
		for(int i = 0; i < count; i++) {
		int input = sc.nextInt();
		a[i] = input;
		}		
				
		Arrays.sort(a);
		
		//두 수 사이의 차 구하는 배열 생성
		int[] ary = new int[a.length-1];
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			if (i + 1 < a.length) {
				b = a[(i + 1)] - a[i];
				ary[i] = b;
			}
		}
		
//배열에서 최솟값 구하기
		int min = ary[0];
		for (int i = 0; i < ary.length; i++) {
			if (min > ary[i]) {
				min = ary[i];
			}
		}
		
//최솟값의 위치 찾기
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == min) {
				b = i;
			}
		}
		System.out.println(a[b] + "과 " + a[b + 1] + "이(가) 가장 가깝습니다.");
	}
}
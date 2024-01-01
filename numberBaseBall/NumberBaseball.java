package numberBaseBall;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberBaseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


//		랜덤 숫자 list에 담기(중복 불허)
		List<Integer> ran = new ArrayList<Integer>();
		while (ran.size() != 3) {
			int temp = (int) (Math.random() * 9 + 1);
			if (ran.contains(temp)) {
			} else {
				ran.add(temp);
			}
		}

//		
//		for (int i : ran) {
//			System.out.print(i);
//		}
//		System.out.println();
		int count = 0;
		while (true) {
			System.out.println(++count+"회차 시도");
			int out = 0;
			int ball = 0;
			int strike = 0;

			System.out.println("값을 입력해주세요");
			
//			input값 list에 담기
			int input = sc.nextInt();
			int inVal[] = new int[3];
			inVal[2] = input % 10;
			inVal[1] = (int) (input * 0.1) % 10;
			inVal[0] = (int) (input * 0.01);

//		Strike & ball 카운트
			for (int i = 0; i < inVal.length; i++) {
				if (inVal[i] == ran.get(i)) {
					strike++;
				} else if (ran.contains(inVal[i])) {
					ball++;
				} else {
					out++;
				}
			}
			
			System.out.println(strike + "S " + ball + "B " + out + "O");
			if (strike == 3) {
				System.out.println(count+"회 만에 성공했습니다.");
				System.out.println("게임 종료");
				break;
			}
		}


	}

}

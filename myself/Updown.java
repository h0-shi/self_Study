package myself;

import java.util.Random;
import java.util.Scanner;

public class Updown {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int number = random.nextInt(1, 100);
		int count = 0;

		while (true) {
			System.out.println("1~100 숫자 입력 :");
			int input = sc.nextInt();
			count++;
			
			if(input > number) {
				System.out.println("DOWN");
			} else if(input<number) {
				System.out.println("UP");
			} else {
				System.out.println("정답! "+count+"번만에 맞췄습니다.");
				break;
			}

		}
		
		sc.close();

//		for (int i = 1;; i++) {
//			System.out.println("1~100 숫자 입력 :");
//			int input = sc.nextInt();
//			if (input > number) {
//				System.out.println("DOWN");
//			} else if (input < number) {
//				System.out.println("UP");
//			} else {
//				System.out.println("정답! " + i + "번만에 맞췄습니다.");
//				break;
//			}
//		}

	}

}

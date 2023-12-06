package myself;

public class Game2 {
	public static void main(String[] args) {
		int count = 0;

		/*
		 * 0부터 10000까지중에 8이 총 몇개인가. (8888은 8 4개로 침) 1~10000까지 모든 수의 각 자리수마다 8이 들어가는 경우
		 * 계산
		 */

		for (int i = 0; i < 10000; i++) {
			String j = Integer.toString(i);
			if (j.charAt(j.length() - 1) == '8') {
				count += 1;
			}
			if (i > 9) {
				if (j.charAt(j.length() - 2) == '8') {
					count += 1;
				}

			}
			if (i > 99) {
				if (j.charAt(j.length() - 3) == '8') {
					count += 1;
				}
			}
			if (i > 999) {
				if (j.charAt(j.length() - 4) == '8') {
					count += 1;
				}
			}
		}
		System.out.println(count);
	}

}
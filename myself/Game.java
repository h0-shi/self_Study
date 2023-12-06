package myself;

public class Game {
	public static void main(String[] args) {
		int count = 0;
		
		/*
		 * 0부터 10000까지중에 8이 총 몇개인가. (8888은 8 4개로 침)
		 * 1~10000까지 각 문자열의 각 자리수를 확인하여 8이 있다면 +1하는 방식
		 */
		for (int j = 0; j < 10000; j++) {
			String k = Integer.toString(j); // String.valueOf() 이것도 숫자->문자
			for (int i = 0; i < k.length(); i++) {
				if (k.charAt(i) == '8') {
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
}

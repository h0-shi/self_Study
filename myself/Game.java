package myself;

public class Game {
	public static void main(String[] args) {
		int count = 0;
		
		for (int j = 0; j < 10000; j++) {
			String k = Integer.toString(j);
			for (int i = 0; i < k.length(); i++) {
				if (k.charAt(i) == '8') {
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
}

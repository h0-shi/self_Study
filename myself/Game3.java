package myself;

public class Game3 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 10000; i++) {
			if ((i / 1000) % 10 == 8) {
				count++;
			}
			if ((i / 100) % 10 == 8) {
				count++;
			}
			if ((i / 10) % 10 == 8) {
				count++;
			}
			if (i % 10 == 8) {
				count++;
			}
		}
		System.out.println(count);
	}
}

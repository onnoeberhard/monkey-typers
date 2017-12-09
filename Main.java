import java.util.Random;

public class Main {

	public static void main(String[] args) {

		final char[] chars = {
				'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f',
				'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
				'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
				'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b',
				'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
				' ', ' ', ' ', ' ', ',', '.', ',', '.'
		};

		final int bound = chars.length;

		final Random r = new Random();

		for(int i = 0; i < 203; i++) {
			for(int ii = 0; ii < 1000; ii++) {
				for(int iii = 0; iii < 60; iii++) {
					for(int iv = 0; iv < 24; iv++) {
						for(int v = 0; v < 365; v++) {
							for(int vi = 0; vi < 1000; vi++) {
								char c = chars[r.nextInt(bound)];
								System.out.print(c);
							}
						}
					}
				}
			}
		}

	}

}

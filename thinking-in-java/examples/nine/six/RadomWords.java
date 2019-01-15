/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 下午1:33:08
 */
package nine.six;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;


/**
 * @author Administrator
 *
 */
public class RadomWords implements Readable {
	private static Random rand = new Random(47);
	private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	private int count;
	
	public RadomWords(int count) {
		this.count = count;
	}
	
	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0) {
			return -1;
		}
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for (int i = 0; i < 4; i++) {
			cb.append(vowels[rand.nextInt(vowels.length)]);
			cb.append(lowers[rand.nextInt(lowers.length)]);
		}
		cb.append(" ");
		return 10;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(new RadomWords(10));
		while (s.hasNext()) {
			System.out.println(s.next());
		}
		
		/*Random r1 = new Random(47);
		Random r2 = new Random(47);
		Random r3 = new Random(100);
		for(int i=0;i<3;i++) {
			System.out.println(r1.nextInt(200) + " "+ r2.nextInt(200) + " "+ r3.nextInt(200));
		}*/
	}

}

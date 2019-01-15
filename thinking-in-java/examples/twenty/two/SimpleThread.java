/**
 * @Description:
 * @author: Administrator
 * @date: 2019年1月2日 上午9:48:20
 */
package twenty.two;

/**
 * @author Administrator
 *
 */
public class SimpleThread extends Thread {
	private int countDown = 5;
	private static int threadCount = 0;
	public SimpleThread() {
		super(Integer.toString(++threadCount));
	}
	public String toString() {
		return "#" + getName() + "(" + countDown + ").";
	}
	public void run() {
		while (true) {
			System.out.println(this);
			if (--threadCount == 0) {
				return;
			}
		}
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new SimpleThread();
		}
	}
}

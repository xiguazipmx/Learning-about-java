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
public class SelfManaged implements Runnable{
	private int countDown = 5;
	private Thread thread = new Thread(this);
	public SelfManaged() {
		thread.start();
	}
	public String toString() {
		return Thread.currentThread().getName() + "(" + countDown + ").";
	}
	public void run() {
		while (true) {
			System.out.println(this);
			if (--countDown == 0) {
				return;
			}
		}
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new SelfManaged();
		}
	}
}

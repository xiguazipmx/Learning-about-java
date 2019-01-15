/**
 * @Description:
 * @author: Administrator
 * @date: 2019年1月2日 上午8:50:03
 */
package twenty.two;

/**
 * @author Administrator
 *
 */
public class SimplePriorities implements Runnable {
	private int countDown = 5;
	private volatile double d;
	private int priority;
	
	public SimplePriorities(int priority) {
		this.priority = priority;
	}
	public String toString() {
		return Thread.currentThread()+" : "+countDown;
	}
	@Override
	public void run() {
		Thread.currentThread().setPriority(priority);
		while (true) {
			for (int i = 0; i < 100000; i++) {
				d += (Math.PI + Math.E) / (double)i;
				if (i % 1000 == 0) {
					Thread.yield();
				}
			}
			System.out.println(this);
			if (--countDown == 0) {
				return;
			}
		}
	}
}

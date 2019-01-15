/**
 * @Description:
 * @author: Administrator
 * @date: 2019年1月2日 上午9:02:30
 */
package twenty.two;

import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 *
 */
public class SimpleFromFactory implements Runnable {

	@Override
	public void run() {
		try {
			while (true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + " "+ this);
			}
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
	}

}

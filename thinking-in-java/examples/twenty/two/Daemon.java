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
public class Daemon implements Runnable {
	private Thread[] t = new Thread[10];
	@Override
	public void run() {
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(new DaemonSpawn());
			t[i].start();
			System.out.println("DaemonSpawn " + i +"started.");
		}
		for (int i = 0; i < t.length; i++) {
			System.out.println("t[" + i +"].isDaemon() = "+ t[i].isDaemon()+ ". ");
		}
		while(true) {
			Thread.yield();
		}
	}

}

class DaemonSpawn implements Runnable{

	@Override
	public void run() {
		while(true) {
			Thread.yield();
		}
	}
	
}

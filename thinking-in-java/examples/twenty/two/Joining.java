/**
 * @Description:
 * @author: Administrator
 * @date: 2019年1月2日 下午5:03:30
 */
package twenty.two;

/**
 * @author Administrator
 *
 */
public class Joining extends Thread {
	
}

class Sleeper extends Thread{
	private int duration;
	public Sleeper(String name, int sleepTime) {
		super(name);
		duration = sleepTime;
		start();
	}
	public void run() {
		try {
			sleep(duration);
		} catch (InterruptedException e) {
			System.out.println(getName() + " was interruoted. "+ "isInterrupted(): " + isInterrupted());
			return;
		}
		System.out.println(getName() + " has awakened.");
	}
}

class Joiner extends Thread{
	private Sleeper sleeper;
	public Joiner(String name, Sleeper sleeper) {
		super(name);
		this.sleeper = sleeper;
		start();
	}
	public void run() {
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			System.out.println("interruoted");
		}
		System.out.println(getName() + " join completed.");
	}
}

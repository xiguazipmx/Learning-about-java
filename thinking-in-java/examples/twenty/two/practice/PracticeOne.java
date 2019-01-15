/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月28日 下午2:29:27
 */
package twenty.two.practice;

/**
 * @author Administrator
 *
 */
public class PracticeOne implements Runnable {
	protected int countDown = 3;
	public PracticeOne() {
		System.out.println("PracticeOne.run() Start");
	}
	@Override
	public void run() {
		while(countDown-- > 0) {
			System.out.println("Hello World");
			Thread.yield();
		}
		System.out.println("PracticeOne.run() close");
		return;
	}
}

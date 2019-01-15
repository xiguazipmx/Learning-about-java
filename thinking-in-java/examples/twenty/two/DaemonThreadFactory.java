/**
 * @Description:
 * @author: Administrator
 * @date: 2019年1月2日 上午9:12:42
 */
package twenty.two;

import java.util.concurrent.ThreadFactory;

/**
 * @author Administrator
 *
 */
public class DaemonThreadFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		Thread thread = new Thread(r);
		thread.setDaemon(true);
		return thread;
	}

}

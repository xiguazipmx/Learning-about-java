/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月29日 上午11:00:55
 */
package twenty.two;

import java.util.concurrent.Callable;

/**
 * @author Administrator
 *
 */
public class TaskWithResult implements Callable<String> {
	private int id;
	public TaskWithResult(int id) {
		this.id = id;
	}
	@Override
	public String call() throws Exception {
		return "result of TaskWithResult " + id;
	}
}

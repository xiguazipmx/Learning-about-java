/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月25日 下午3:23:19
 */
package ten.ten;

/**
 * @author Administrator
 *
 */
public class LocalInnerClass {
	private int count = 0;
	Counter getCounter(final String name) {
		class LocalCounter implements Counter{
			public LocalCounter() {
				System.out.println("LocalCounter()");
			}
			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		}
		return new LocalCounter();
	}
	
	Counter getCounter2(final String name) {
		return new Counter() {
			{
				System.out.println("Counter()");
			}
			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		};
	}
	
	public static void main(String[] args) {
		LocalInnerClass localInnerClass = new LocalInnerClass();
		Counter counter = localInnerClass.getCounter("Local inner");
		Counter counter2 = localInnerClass.getCounter2("Anonymous inner");
		for (int i = 0; i < 5; i++) {
			System.out.println(counter.next());
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(counter2.next());
		}
	}
}
interface Counter{
	int next();
}

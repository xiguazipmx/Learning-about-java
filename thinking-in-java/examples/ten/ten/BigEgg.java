/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月25日 下午2:54:38
 */
package ten.ten;

/**
 * @author Administrator
 *
 */
public class BigEgg extends Egg{
	public class Yolk{
		public Yolk() {
			System.out.println("BigEgg.Yolk()");
		}
	}
}

class Egg{
	private Yolk y;
	protected class Yolk{
		public Yolk() {
			System.out.println("Egg.Yolk()");
		}
	}
	public Egg() {
		System.out.println("New Egg()");
		y = new Yolk();
	}
}

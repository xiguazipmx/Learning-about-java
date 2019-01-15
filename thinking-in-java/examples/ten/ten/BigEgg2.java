/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月25日 下午2:59:18
 */
package ten.ten;

import ten.ten.Egg2.Yolk;

/**
 * @author Administrator
 *
 */
public class BigEgg2 extends Egg2{
	public class Yolk extends Egg2.Yolk{
		public Yolk() {
			System.out.println("BIGEgg2.Yolk()");
		}
		public void f() {
			System.out.println("BigEgg2.Yolk.f()");
		}
	}
	public BigEgg2() {
		insertYolk(new Yolk());
	}
}

class Egg2{
	protected class Yolk{
		public Yolk() {
			System.out.println("Egg2.Yolk()");
		}
		public void f() {
			System.out.println("Egg2.Yolk.f()");
		}
	}
	private Yolk yolk = new Yolk();
	public Egg2() {
		System.out.println("New Egg2()");
	}
	public void insertYolk(Yolk yy) {
		yolk = yy;
	}
	public void g() {
		yolk.f();
	}
}

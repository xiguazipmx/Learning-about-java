/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 下午1:51:18
 */
package ten.four.practice;

/**
 * @author Administrator
 *
 */
public class Test7 {
	private String s = "hello";
	public class Inner{
		public void change(String change) {
			f();
			System.out.println("s="+s);
			s = change;
			System.out.println("s="+s);
		}
	}
	public Inner toInner() {
		return new Inner();
	}
	private void f() {
		System.out.println("Outer.f()");
	}
}

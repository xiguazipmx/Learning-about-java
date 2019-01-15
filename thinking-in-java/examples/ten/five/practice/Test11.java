/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 下午4:03:30
 */
package ten.five.practice;

/**
 * @author Administrator
 *
 */
public class Test11 {
	private class Inner implements Test9Interface{
		@Override
		public void f() {
			System.out.println("Inner.f()");
		}
		@Override
		public String v(String s) {
			return s;
		}
	}
	
	public Test9Interface to() {
		Test9Interface t = new Inner();
		t.f();
		return t;
	}
}

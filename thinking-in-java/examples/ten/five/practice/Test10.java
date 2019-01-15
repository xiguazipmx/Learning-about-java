/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 下午3:44:27
 */
package ten.five.practice;


/**
 * @author Administrator
 *
 */
public class Test10 {
	public void m(String word) {
		if (word.equals("hello")) {
			class Inner implements Test9Interface{
				@Override
				public void f() {
					System.out.println("Inner.f()");
				}
				@Override
				public String v(String s) {
					return s;
				}
			}
			Inner inner = new Inner();
			inner.f();
		}
	}
	
	public void track() {
		m("hello");
	}
}

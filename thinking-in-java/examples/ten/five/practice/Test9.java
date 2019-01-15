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
public class Test9 {
	String word = "hello";
	public Test9Interface m() {
		class Inner implements Test9Interface{
			@Override
			public void f() {
				System.out.println("Inner.f()");
			}
			@Override
			public String v(String s) {
				System.out.println(word);
				word = s;
				System.out.println(word);
				return word;
			}
		}
		return new Inner();
	}
}

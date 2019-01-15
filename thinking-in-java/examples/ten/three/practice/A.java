/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 上午11:17:23
 */
package ten.three.practice;

/**
 * @author Administrator
 *
 */
public class A {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
	}
}

class Outer{
	public class Inner{
		public Inner() {
			System.out.println("success");
		}
	}
}

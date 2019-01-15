/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 上午10:26:18
 */
package ten.one.practice;

/**
 * @author Administrator
 *
 */
public class Outer {
	
	public class Inner{
		public Inner() {
			System.out.println("success");
		}
	}
	
	public Inner toInner() {
		return new Inner();
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner i = outer.toInner();
	}

}

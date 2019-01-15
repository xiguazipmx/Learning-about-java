/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 上午10:26:18
 */
package ten.two.practice;

/**
 * @author Administrator
 *
 */
public class Outer {
	private String s;
	
	public Outer(String s) {
		this.s = s;
	}
	
	public class Inner{
		private String k;
		public Inner(String s) {
			k = s;
			System.out.println("success");
		}
		public String toString() {
			return s+" "+k;
		}
	}
	
	public Inner toInner(String s) {
		return new Inner(s);
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer("Hello");
		System.out.println(outer.toInner("World"));
	}

}

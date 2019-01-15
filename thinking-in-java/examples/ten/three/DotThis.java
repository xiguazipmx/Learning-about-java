/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 上午10:51:58
 */
package ten.three;

/**
 * @author Administrator
 *
 */
public class DotThis {
	
	void f() {
		System.out.println("DotThis.f()");
	}
	public class Inner{
		public DotThis outer() {
			return DotThis.this;
		}
	}
	public Inner inner() {
		return new Inner();
	}
	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		DotThis.Inner dtin = dt.new Inner();
		dti.outer().f();
		
	}

}

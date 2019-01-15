/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 上午11:41:51
 */
package ten.four.practice.two;

import ten.four.practice.one.A;

/**
 * @author Administrator
 *
 */
public class TestA {
	protected class AInner implements A{
		@Override
		public String f() {
			return "AInner.f()";
		}
	}
	
	public AInner to() {
		return new AInner();
	}
}

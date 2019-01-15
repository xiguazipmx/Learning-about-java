/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 上午11:43:52
 */
package ten.four.practice.three;

import ten.four.practice.one.A;
import ten.four.practice.two.TestA;

/**
 * @author Administrator
 *
 */
public class C extends TestA {
	
	public A toA() {
		TestA a = new TestA();
		System.out.println(a.to().f());
		return a.to();
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.toA();
	}

}

/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月25日 上午9:31:32
 */
package ten.eight;

/**
 * @author Administrator
 *
 */
public class MultiImplementation {
	static void takesD(D d) {}
	static void talesE(E e) {}
	public static void main(String[] args) {
		Z z = new Z();
		takesD(z);
		talesE(z.makeE());
	}
}

class D{}
abstract class E{}
class Z extends D{
	E makeE() {
		return new E() {};
	}
}

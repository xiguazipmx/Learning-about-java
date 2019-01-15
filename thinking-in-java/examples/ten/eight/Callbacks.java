/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月25日 上午10:00:53
 */
package ten.eight;

/**
 * @author Administrator
 *
 */
public class Callbacks {
	public static void main(String[] args) {
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);
		Caller caller1 = new Caller(c1);
		Caller caller2 = new Caller(c2.getCallbackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}
}

interface Incrementable{
	void increment();
}

class Callee1 implements Incrementable{
	private int i=0;
	@Override
	public void increment() {
		i++;
		System.out.println(i);
	}
}

class MyIncrement{
	public void increment() {
		System.out.println("Other operation");
	}
	static void f(MyIncrement mi) {
		mi.increment();
	}
}

class Callee2 extends MyIncrement{
	private int i=0;
	@Override
	public void increment() {
		super.increment();
		i++;
		System.out.println(i);
	}
	private class Closure implements Incrementable{
		@Override
		public void increment() {
			Callee2.this.increment();
		}
	}
	Incrementable getCallbackReference() {
		return new Closure();
	}
}

class Caller{
	private Incrementable callbackReference;
	public Caller(Incrementable cbh) {
		callbackReference = cbh;
	}
	void go() {
		callbackReference.increment();
	}
}
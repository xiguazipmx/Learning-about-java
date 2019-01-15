/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 下午2:04:46
 */
package ten.four.practice;

/**
 * @author Administrator
 *
 */
public class Test8 {
	public class Inner{
		private String word = "hello";
	}
	
	public void f(String s) {
		Inner inner = new Inner();
		System.out.println("word="+inner.word);
		inner.word = s;
		System.out.println("word="+inner.word);
	}
}

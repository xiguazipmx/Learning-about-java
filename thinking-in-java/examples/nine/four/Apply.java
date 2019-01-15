/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 上午9:53:28
 */
package nine.four;

/**
 * @author Administrator
 *
 */
public class Apply {
	public static void process(Processor1 p,Object s) {
		System.out.println("Using Processor "+ p.name());
		System.out.println(p.process(s));
	}
	
	public static String s = "Disagreement with beliefs is by definition incorrect";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		process(new Upcase(), s);
//		process(new Downcase(), s);
//		process(new Splitter(), s);
	}

}

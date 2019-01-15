/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 上午10:29:26
 */
package nine.four;

/**
 * @author Administrator
 *
 */
public abstract class StringProcessor implements Processor1 {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

	@Override
	public abstract Object process(Object input);
	
	public static String s = "Disagreement with beliefs is by definition incorrect";
	
	public static void main(String[] args) {
		Apply.process(new Upcase(), s);
	}

}

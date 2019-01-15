/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 上午9:52:03
 */
package nine.four;

/**
 * @author Administrator
 *
 */
public class Downcase extends Processor {
	String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

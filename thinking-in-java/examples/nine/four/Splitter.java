/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 上午9:52:39
 */
package nine.four;

import java.util.Arrays;

/**
 * @author Administrator
 *
 */
public class Splitter extends Processor {
	String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}

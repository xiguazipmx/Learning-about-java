/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 上午9:59:23
 */
package nine.four;

/**
 * @author Administrator
 *
 */
public class Filter {
	
	public String name() {
		return getClass().getSimpleName();
	}
	public Waveform process(Waveform input) {
		return input;
	}
}

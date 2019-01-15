/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 上午9:57:24
 */
package nine.four;

/**
 * @author Administrator
 *
 */
public class Waveform {
	
	private static long counter;
	private  final long id = counter++;

	public String toString() {
		return "Waveform" + id ;
	}
	
}

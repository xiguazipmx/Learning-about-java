/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 上午10:03:00
 */
package nine.four;

/**
 * @author Administrator
 *
 */
public class HighPass extends Filter {
	double cutoff;
	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}
	public Waveform process(Waveform input) {
		return input;
	}
}

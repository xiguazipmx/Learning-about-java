/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 上午10:00:45
 */
package nine.four;

/**
 * @author Administrator
 *
 */
public class LowPass extends Filter {
	
	double cutoff;
	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}
	public Waveform process(Waveform input) {
		return input;
	}
}

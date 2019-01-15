/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 上午10:03:40
 */
package nine.four;

/**
 * @author Administrator
 *
 */
public class BandPass extends Filter {
	double lowCutoff,highCutoff;
	public BandPass(double lowCut, double highCut) {
		lowCutoff = lowCut;
		highCutoff = highCut;
	}
	public Waveform process(Waveform input) {
		return input;
	}
}

/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 上午11:01:57
 */
package nine.four;

/**
 * @author Administrator
 *
 */
public class FilterProcessor {

	public static void main(String[] args) {
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)),w);
	}

}

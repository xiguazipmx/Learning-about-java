/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 上午11:00:05
 */
package nine.four;

/**
 * @author Administrator
 *
 */
public class FilterAdapter implements Processor1 {
	Filter filter;
	
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return filter.name();
	}

	@Override
	public Object process(Object input) {
		// TODO Auto-generated method stub
		return filter.process((Waveform)input);
	}

}

/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 上午10:05:38
 */
package ten.three.practice;


/**
 * @author Administrator
 *
 */
public class Sequence {
	
	private Object[] items;
	private int next = 0;
	public Sequence(int size) {
		items = new Object[size];
	}
	public void add(Object x) {
		if (next < items.length) {
			items[next++] = x;
		}
	}
	private class SequenceSelector implements Selector{
		private int i = 0;
		@Override
		public boolean end() {
			return i == items.length;
		}
		@Override
		public Object current() {
			return items[i];
		}
		@Override
		public void next() {
			if (i < items.length) {
				i++;
			}
		}
		public Sequence outer() {
			return Sequence.this;
		}
	}
	public Selector selector(){
		return new SequenceSelector();
	}
	
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		Sequence.SequenceSelector selector = (SequenceSelector) sequence.selector();
		selector.outer().add("111");
	}

}

interface Selector{
	boolean end();
	Object current();
	void next();
}

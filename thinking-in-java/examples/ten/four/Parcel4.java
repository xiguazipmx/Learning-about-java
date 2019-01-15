/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 上午11:27:18
 */
package ten.four;

/**
 * @author Administrator
 *
 */
public class Parcel4 {
	
	private class PContents implements Contents{
		private int i=11;
		public int value() {
			return i;
		}
	}
	protected class PDestination implements Destination{
		private String label;
		@Override
		public String readLabel() {
			return label;
		}
		public PDestination(String whereTo) {
			label = whereTo;
		}
	}
	public Contents contents() {
		return new PContents();
	}
	public Destination destination(String s) {
		return new PDestination(s);
	}
	public static void main(String[] args) {
		Parcel4 parcel4 = new Parcel4();
		Contents contents = parcel4.contents();
		Destination destination = parcel4.destination("hello");
		System.out.println(destination.readLabel());
	}

}


/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 下午3:03:43
 */
package ten.five;

import ten.four.Destination;

/**
 * @author Administrator
 *
 */
public class Parcel5 {
	public Destination destination(String s) {
		class PDestination implements Destination{
			private String label;
			private PDestination(String whereTo) {
				label = whereTo;
			}
			@Override
			public String readLabel() {
				return label;
			}
		}
		return new PDestination(s);
	}
	
	public static void main(String[] args) {
		Parcel5 parcel5 = new Parcel5();
		Destination destination = parcel5.destination("hello");
		System.out.println(destination.readLabel());
	}
}

/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 下午4:19:02
 */
package ten.six;

import ten.four.Contents;

/**
 * @author Administrator
 *
 */
public class Parcel7 {
	public Contents contents() {
		return new Contents() {
			private int i = 11;
			@Override
			public int value() {
				return i;
			}
		};
	}
	public static void main(String[] args) {
		Parcel7 parcel7 = new Parcel7();
		Contents contents = parcel7.contents();
	}
}

/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 下午5:18:22
 */
package ten.one;

/**
 * @author Administrator
 *
 */
public class Parcel1 {
	class Contenes{
		private int i = 11;
		public int value() {
			return i;
		}
	}
	class Desination{
		private String label;
		public Desination(String whereTo) {
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	
	public void ship(String dest) {
		Contenes c = new Contenes();
		Desination d = new Desination(dest);
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args) {
		Parcel1 parcel1 = new Parcel1();
		parcel1.ship("Hello");
	}
}

/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 上午11:04:06
 */
package ten.three;

/**
 * @author Administrator
 *
 */
public class Parcel3 {
	
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
	
	public static void main(String[] args) {
		Parcel3 p = new Parcel3();
		Parcel3.Contenes c = p.new Contenes();
		Parcel3.Desination desination= p.new Desination("Hello");
	}

}

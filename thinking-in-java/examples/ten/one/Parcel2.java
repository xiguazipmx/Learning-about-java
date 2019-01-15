/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 上午9:55:39
 */
package ten.one;


/**
 * @author Administrator
 *
 */
public class Parcel2 {
	class Contents{
		private int i = 11;
		public int value() {
			return i;
		}
	}
	
	class Destination{
		private String label;
		public Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	
	public Destination to(String s) {
		return new Destination(s);
	}
	
	public Contents contents() {
		return new Contents();
	}
	
	public void ship(String dest) {
		Contents c = contents();
		Destination d = to(dest);
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
		Parcel2 q = new Parcel2();
		Parcel2.Contents contents = q.contents();
		Parcel2.Destination destination = q.to("Borneo");
		System.out.println("------------------");
		System.out.println(destination.readLabel());
	}
}

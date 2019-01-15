/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 下午3:11:00
 */
package ten.five;

/**
 * @author Administrator
 *
 */
public class Parcel6 {
	private void internalTracking(boolean b) {
		if (b) {
			class TrackingSlip {
				private String id;
				TrackingSlip(String s){
					id = s;
				}
				String getSlip() {return id;}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
		}
	}
	public void track() {
		internalTracking(true);
	}
	public static void main(String[] args) {
		Parcel6 parcel6 = new Parcel6();
		parcel6.track();
	}

}

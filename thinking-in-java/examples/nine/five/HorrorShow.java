/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 上午11:52:06
 */
package nine.five;

/**
 * @author Administrator
 *
 */
public class HorrorShow {

	static void u(Monster b){ b.menace();}
	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}
	static void w(Lethal l) {l.kill();}
	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		VAmpire vald = new VeryBadVampire();
		u(vald);
		v(vald);
		w(vald);
	}

}

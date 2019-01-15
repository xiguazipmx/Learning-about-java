/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月21日 上午11:37:45
 */
package ten;

import ten.eight.Callbacks;
import ten.five.practice.Test10;
import ten.five.practice.Test11;
import ten.five.practice.Test9;
import ten.five.practice.Test9Interface;
import ten.four.Contents;
import ten.four.Destination;
import ten.four.Parcel4;
import ten.four.practice.Test7;
import ten.four.practice.Test8;
import ten.ten.BigEgg;
import ten.ten.BigEgg2;
import ten.ten.LocalInnerClass;

/**
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		/*Parcel4 parcel4 = new Parcel4();
		Contents contents = parcel4.contents();
		Destination destination = parcel4.destination("hello");
		System.out.println(destination.readLabel());
		//无法访问Parcel4.PContents*/
		//练习7
		/*Test7 outer = new Test7();
		Test7.Inner inner = outer.toInner();
		inner.change("world");*/
		//练习8
		/*Test8 test8 = new Test8();
		test8.f("oooo");*/
		//练习9
		/*Test9 test9 = new Test9();
		Test9Interface test9Interface = test9.m();
		test9Interface.f();
		test9Interface.v("world");*/
		//练习10
		/*Test10 test10 = new Test10();
		test10.track();*/
		//练习11
		/*Test11 t = new Test11();
		Test9Interface tInterface = t.to();
		tInterface.f();*/
		
		//BigEgg bigEgg = new BigEgg();
		
		/*BigEgg2 bigEgg2 = new BigEgg2();
		bigEgg2.g();*/
		
	}

}

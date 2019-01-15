/**
 * @Description:
 * @author: Administrator
 * @date: 2019年1月2日 上午10:24:27
 */
package twenty.two;

import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 *
 */
public class ThreadVariations {
	
}

class InnerThread1{
	private int countDown = 5;
	private Inner inner;
	private class Inner extends Thread{
		public Inner(String name) {
			super(name);
			start();
		}
		
		public void run() {
			try {
				sleep(10);
				while(true) {
					System.out.println(this);
					if (--countDown == 0) {
						return;
					}
				}
			} catch (InterruptedException e) {
				System.out.println("Interruoted");
			}
		}
		
		public String toString() {
			return getName() + ": " + countDown;
		}
	}
	
	public InnerThread1(String name) {
		inner = new Inner(name);
	}
}

class InnerThread2{
	private int countDown = 5;
	private Thread t;
	public InnerThread2(String name){
		t = new Thread(name) {
			public void run() {
				try {
					while(true) {
						System.out.println(this);
						if (--countDown == 0) {
							sleep(10);
						}
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("sleep() interrupted");
				};
			}
			public String toString() {
				return getName() + ": " + countDown;
			}
		};
		t.start();
	}
}

class InnerRunnable1{
	private int countDown = 5;
	private Inner inner;
	private class Inner implements Runnable{
		Thread t;
		Inner(String name) {
			t = new Thread(this, name);
			t.start();
		}
		
		public void run() {
			try {
				while(true) {
					System.out.println(this);
					System.out.println(this);
					if (--countDown == 0) {
						return;
					}
					TimeUnit.MILLISECONDS.sleep(10);
				}
			} catch (InterruptedException e) {
				System.out.println("sleep() Interruoted");
			}
		}
		public String toString() {
			return t.getName() + ": " + countDown;
		}
	}
	public InnerRunnable1(String name) {
		inner = new Inner(name);
	}
}

class InnerRunnable2{
	private int countDown = 5;
	private Thread t;
	public InnerRunnable2(String name){
		t = new Thread(new Runnable() {
			public void run() {
				try {
					while(true) {
						System.out.println(this);
						if (--countDown == 0) {
							return;
						}
						TimeUnit.MILLISECONDS.sleep(10);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("sleep() interrupted");
				};
			}
			public String toString() {
				return Thread.currentThread().getName() + ": " + countDown;
			}
		}, name);
		t.start();
	}
}

class ThreadMethod{
	private int countDown = 5;
	private Thread thread;
	private String name;
	public ThreadMethod(String name) {
		this.name = name;
	}
	public void runTask() {
		if (thread == null) {
			thread = new Thread(name) {
				public void run() {
					try {
						while(true) {
							System.out.println(this);
							if (--countDown == 0) {
								return;
							}
							sleep(10);
						}
					} catch (InterruptedException e) {
						// TODO: handle exception
						System.out.println("sleep() interrupted");
					}
				}
			};
			thread.start();
		}
	}
}

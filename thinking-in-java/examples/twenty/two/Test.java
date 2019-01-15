/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月28日 下午2:19:04
 */
package twenty.two;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import twenty.two.practice.PracticeOne;

/**
 * @author Administrator
 *
 */
public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		/*LiftOff liftOff = new LiftOff();
		liftOff.run();*/
		
		/*Thread thread = new Thread(new LiftOff());
		thread.start();
		System.out.println("Waiting for LiftOff!");*/
		
		/*for (int i = 0; i < 5; i++) {
			new Thread(new LiftOff()).start();
		}
		System.out.println("Waiting for LiftOff!");*/
		
		/*for (int i = 0; i < 5; i++) {
			new Thread(new PracticeOne()).start();
		}*/
		
		
		/*ExecutorService ec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			ec.execute(new PracticeOne());
		}
		ec.shutdown();*/
		
		/*ExecutorService eService = Executors.newCachedThreadPool();
		eService.execute(new LiftOff());
		eService.shutdown();*/
		
		/*ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			executorService.execute(new LiftOff());
		}
		executorService.shutdown();*/
		
		/*ExecutorService executorService = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new LiftOff());
		}
		executorService.shutdown();*/
		
		/*ExecutorService ec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			results.add(ec.submit(new TaskWithResult(i)));
		}
		
		for (Future<String> future : results) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				System.out.println(e);
				return;
			} catch (ExecutionException e) {
				System.out.println(e);
			}finally {
				ec.shutdown();
			}
		}*/
		
		/*ExecutorService ec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			ec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
			ec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
			ec.shutdown();
		}*/
		
		/*for (int i = 0; i < 10; i++) {
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(true);
			daemon.start();
		}
		System.out.println("All daemons started");
		TimeUnit.MILLISECONDS.sleep(175);*/
		
		/*ExecutorService ec = Executors.newCachedThreadPool(new DaemonThreadFactory());
		for(int i = 0; i<10; i++) {
			ec.execute(new SimpleFromFactory());
		}
		System.out.println("All daemons started");
		TimeUnit.MILLISECONDS.sleep(500);*/
		
		/*Thread thread = new Thread(new Daemon());
		thread.setDaemon(true);
		thread.start();
		System.out.println("d.isDaemon " + thread.isDaemon() + ".");
		TimeUnit.SECONDS.sleep(1000);*/
		
		/*for (int i = 0; i < 5; i++) {
			SimpleThread simpleThread = new SimpleThread();
		}*/
		
		/*for (int i = 0; i < 5; i++) {
			new SelfManaged();
		}*/
		
		/*new InnerThread1("InnerThread1");
		new InnerThread2("InnerThread2");
		new InnerRunnable1("InnerRunnable1");
		new InnerRunnable2("InnerRunnable2");
		new ThreadMethod("ThreadMethod").runTask();*/
		
		Sleeper sleeper = new Sleeper("Sleepey", 1500);
		Sleeper grumpy = new Sleeper("Grumpy", 1500);
		
		Joiner joiner = new Joiner("Dopey", sleeper);
		Joiner doc = new Joiner("Doc", grumpy);
		
		grumpy.interrupt();
	}

}

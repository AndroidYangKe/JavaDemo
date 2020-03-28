package thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {
	public static void main(String[] args) {
		Thread t = new Thread();
		t.yield();
		
		// 缓存线程池，内部线程数最大为Integer.MAX_VALUE
		testCachedThreadPool();

		// 定长线程池
		// testFixedThreadPool();

		// 定长线程池--1
		// testScheduledThreadPool_1();

		// 定长线程池--2
		// testScheduledThreadPool_2();

		// 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务
		// testSingleThredPool();

	}

	/**
	 * 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定 顺序(FIFO, LIFO, 优先级)执行。
	 */
	private static void testSingleThredPool() {
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
			final int index = i;
			singleThreadExecutor.execute(new Runnable() {
				public void run() {
					try {
						System.out.println(Thread.currentThread());
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

	/**
	 * 创建一个定长线程池，支持定时及周期性任务执行。定期执行示例代码如下：
	 */
	private static void testScheduledThreadPool_2() {
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out.println("delay 1 seconds, and excute every 3 seconds");
			}
		}, 1, 2, TimeUnit.SECONDS);
	}

	/**
	 * 创建一个定长线程池，支持定时及周期性任务执行。延迟执行示例代码如下
	 */
	private static void testScheduledThreadPool_1() {
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		scheduledThreadPool.schedule(new Runnable() {
			public void run() {
				System.out.println("delay 3 seconds");
			}
		}, 3, TimeUnit.SECONDS);
	}

	/**
	 * 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
	 */
	private static void testCachedThreadPool() {
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			final int index = i;
			try {
				Thread.sleep(index * 100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cachedThreadPool.execute(new Runnable() {
				public void run() {
					System.out.println(Thread.currentThread());
				}
			});
		}
	}

	/**
	 * 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列（LinkedBlockingQueue）中等待
	 */
	private static void testFixedThreadPool() {
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 30; i++) {
			final int index = i;
			fixedThreadPool.execute(new Runnable() {
				public void run() {
					try {
						System.out.println(Thread.currentThread().getId());
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}
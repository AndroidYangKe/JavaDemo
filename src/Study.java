import java.util.HashMap;
import java.util.TreeSet;
import java.util.concurrent.locks.ReentrantLock;

public class Study {

	// & 11为1 其他为0；
	// | 00为0 其他为1；
	public static void main(String[] args) {

	}

	/**
	 * 斐波那契数，例：1 1 2 3 5 8 13 21
	 *
	 * 测试：
	 * int num = feiBo(5);
	 * System.out.println("---reuslt-------->"+num);
	 *
	 * @param num n
	 * @return 第N个斐波那契数
	 */
	public static int feiBo(int num) {
		if(num == 1) return 1;
		if(num == 2) return 2;

		return feiBo(num-1) + feiBo(num-2);
	}

	/**
	 * 递归测试
	 */
	static int t(int par) {
		if (par == 1) {
			System.out.println("1");
		} else {
			System.out.println(par--);
			t(par);
		}
		return par;
	}

	/**
	 * 两个变量翻转
	 */
	public static void swapNum(int a, int b) {
		a ^= b;
		b ^= a;
		a ^= b;
		System.out.println("a=" + a + "  b=" + b);
	}

	/**
     * 数组a中只有一个数出现一次，其他数都出现了2次，找出这个数字
	 */
	public static int find1From2(int[] a) {
		int len = a.length, res = 0;
		for (int i = 0; i < len; i++) {
			res = res ^ a[i];
			System.out.println(res);
		}
		return res;
	}

	/****************************** 常规算法 *************************************************************************************************************************/
	/**
	 * 字符去重 例：优化前 asdfasdf 优化后 asdf
	 */
	public static String optimizeStr1(String str) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (int i = 0; i < str.length(); i++) {
			String strOld = String.valueOf(str.charAt(i));
			if (isFirst) {
				isFirst = false;
				sb.append(strOld);
			}

			for (int j = 0; j < sb.length(); j++) {
				if (!sb.toString().contains(strOld)) {
					sb.append(strOld);
				}
			}
		}

		System.out.print(sb.toString());
		return sb.toString();
	}

	/**
	 * 字符去重 例：优化前 asdfasdf 优化后 asdf
	 */
	public static void optimizeStr2(String str) {
		TreeSet<String> set = new TreeSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i) + ",");
		}
		for (String string : set) {
			System.out.print(string);
		}
	}

	/**
	 * 字符反转 例：i love you--> uoy evol i
	 */
	public static String revertChar(String str) {
		if (str == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		char[] ary = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(ary[i]);
			System.out.print(ary[i]);
		}
		return sb.toString();
	}

	/**
	 * 单词反转
	 */
	public static String revertWord(String word) {
		if (word == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			String[] strAry = word.split(" ");
			if (i == word.length() - 1) {
				for (int j = strAry.length - 1; j >= 0; j--) {
					sb.append(strAry[j] + " ");
				}
			}
		}
		System.out.println(sb.toString());
		return sb.toString();
	}

	/**
	 * 阶乘
	 */
	public static long factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	/****************************** 单例 *************************************************************************************************************************/
	public volatile static Study instance1 = null;

	/**
	 * 懒汉加载
	 * 
	 * 双重检查锁单例
	 */
	public static Study getInstance1() {
		if (instance1 == null) {
			synchronized (Study.class) {
				if (instance1 == null) {
					instance1 = new Study();
				}
			}
		}
		return instance1;
	}

	public static Study instance2 = null;

	static {
		instance2 = new Study();
	}

	/**
	 * 懒汉加载
	 */
	public static Study getInstance2() {
		return instance2;
	}

	/****************************** 排序 *************************************************************************************************************************/
	/**
	 * 冒泡排序： 时间复杂度：最好为o（n），最坏为o（n²）；
	 * 
	 * @param ary
	 *            要排序的数组
	 * 
	 *            算法稳定性： 冒泡排序就是把小的元素往前调或者把大的元素往后调。比较是相邻的两个元素比较，交换也发生在这两个元素之间。
	 *            所以，如果两个元素相等，我想你是不会再无聊地把他们俩交换一下的；如果两个相等的元素没有相邻，那么即使通
	 *            过前面的两两交换把两个相邻起来，这时候也不会交换，所以相同元素的前后顺序并没有改变，所以冒泡排序是一种 稳定排序算法。
	 */
	public static void bublleSort(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			for (int j = 1; j < ary.length; j++) {
				if (ary[j - 1] > ary[j]) {
					ary[j - 1] ^= ary[j];
					ary[j] ^= ary[j - 1];
					ary[j - 1] ^= ary[j];
				}
			}
		}
	}

	/**
	 * 选择排序:
	 * 
	 * 选择排序（Selection sort）是一种简单直观的排序算法。它的工作原理是每一次从待排序
	 * 的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据 元素排完。 选择排序是不稳定的排序方法 （比如序列[5，
	 * 5，3]第一次就将第一个[5]与[3] 交换，导致第一个5挪动到第二个5后面）。
	 * 
	 * @param ary 被排序的数组
	 */
	public static void selectionSort(int[] ary) {
		int temp = 0;
		for (int i = 0; i < ary.length; i++) {
			int lowIndex = i;
			for (int j = i + 1; j < ary.length; j++) {
				if (ary[j] < ary[lowIndex]) {
					lowIndex = j;
				}
			}
			temp = ary[i];
			ary[i] = ary[lowIndex];
			ary[lowIndex] = temp;
		}
	}

	/**
	 * int[] ary = {10, 2, 923, 123, 9};
	 * quickSortArray(ary, 0, ary.length-1);
	 * for (int i = 0; i < ary.length; i++) {
	 * 	System.out.println(ary[i]);
	 * }
	 *
	 * 快速排序 时间复杂度：O(nlogn);
	 * 更多信息可参考百度百科
	 */
	public static int[] quickSortArray(int[] array, int start, int end) {
		if(array==null || array.length <= 1) {
			return array;
		}
		int pivot = array[start];
		int i = start;
		int j = end;
		while (i < j) {
			while ((array[j] > pivot)) {
				j--;
			}
			while ((array[i] < pivot)) {
				i++;
			}
			if ((array[i] == array[j]) && (i < j)) {
				i++;
			} else {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		if (i - 1 > start) array = quickSortArray(array, start, i - 1);
		if (j + 1 < end) array = quickSortArray(array, j + 1, end);
		return array;
	}

	/**
	 * 查找单独存在的整数 亦或运算:二进制运算相同为0不同为1 例：1,1,2,3,2 结果为3
	 */
	public static int getOddNum(int[] ary) {
		int temp = 0;
		for (int i = 0; i < ary.length; i++) {
			temp ^= ary[i];
		}
		return temp;
	}

	/**
	 * 查找数组中缺失的数字。例：1,2,3,5 结果4 此算法空间复杂度比较高
	 */
	public static int searchNum2(int[] ary) {
		int temp = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < ary.length + 1; i++) {
			map.put(i, 0);
			System.out.println("key = " + i + "\t" + "value = " + 0);
		}

		System.out.println("------------------------------------");
		for (int i = 0; i < ary.length; i++) {
			map.put(ary[i], 1);
			System.out.println("key = " + i + "\t" + "value = " + 1);
		}

		for (int i = 0; i < ary.length + 1; i++) {
			if (map.get(i) == 0) {
				temp = i;
			}
		}

		System.out.println(temp);
		return temp;
	}

	/**
	 * 查找数组中缺失的数字。例：1,2,3,5 结果为4 此算法时间控件复杂度最优
	 */
	public static int searchNum1(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}

		for (int i = 0; i < ary.length; i++) {
			sum -= ary[i];
		}
		System.out.println(sum);
		return sum;
	}

	// ----------------------------------------多线程打印1234----------------------------------------------
	private static ReentrantLock mLock = new ReentrantLock();
	private static int temp = 0;
	private static boolean mIsExit = true;

	static class T1 extends Thread {
		@Override
		public void run() {
			super.run();
			while (mIsExit) {
				mLock.lock();
				if (temp % 4 == 0) {
					System.out.println("1");
					temp++;
				}
				mLock.unlock();
			}
		}
	}

	static class T2 extends Thread {
		@Override
		public void run() {
			super.run();
			while (mIsExit) {
				mLock.lock();
				if (temp % 4 == 1) {
					System.out.println("2");
					temp++;
				}
				mLock.unlock();
			}
		}
	}

	static class T3 extends Thread {
		@Override
		public void run() {
			super.run();
			while (mIsExit) {
				mLock.lock();
				if (temp % 4 == 2) {
					System.out.println("3");
					temp++;
				}
				mLock.unlock();
			}
		}
	}

	static class T4 extends Thread {
		@Override
		public void run() {
			super.run();
			while (mIsExit) {
				mLock.lock();
				if (temp % 4 == 3) {
					System.out.println("4-----------");
					mIsExit = false;
				}

				mLock.unlock();
			}
		}
	}

	// public static void main(String[] args) {
	// Thread t1 = new T1();
	// Thread t2 = new T2();
	// Thread t3 = new T3();
	// Thread t4 = new T4();
	// t1.start();
	// t2.start();
	// t3.start();
	// t4.start();
	// }
	// ----------------------------------------多线程打印1234----------------------------------------------

}

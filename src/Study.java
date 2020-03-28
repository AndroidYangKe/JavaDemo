import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.concurrent.locks.ReentrantLock;

public class Study {

	private Study() {
	}

	private static final LinkedList<String> LOTS_OF_STRINGS = new LinkedList<>();

	void t(final String a) {
	}

	public static void main(String[] args) {
		int[] ary = { 1, 1, 3, 2, 2, 3, 6, 0, 6, 7, 7, 19, 19, 5, 5 };
		String defStr = "i love you";
		String defStr2 = "asdfaascvffeesfgfff";
		// find1From2(ary);
		// for(int i = 0; i<10; i++){
		// if(i == 6){
		// return;
		// }
		//
		// System.out.println(i);
		// }

		String s1 = "{\"point\":[{\"longitude\":\"40.055826\",\"latitude\":\"116.307917\"},{\"longitude\":\"40.055916\",\"latitude\":\"116.308455\"},{\"longitude\":\"40.055967\",\"latitude\":\"116.308549\"},{\"longitude\":\"40.056014\",\"latitude\":\"116.308574\"},{\"longitude\":\"40.056440\",\"latitude\":\"116.308485\"},{\"longitude\":\"40.056816\",\"latitude\":\"116.308352\"},{\"longitude\":\"40.057997\",\"latitude\":\"116.307725\"},{\"longitude\":\"40.058022\",\"latitude\":\"116.307693\"},{\"longitude\":\"40.058029\",\"latitude\":\"116.307590\"},{\"longitude\":\"40.057913\",\"latitude\":\"116.307119\"},{\"longitude\":\"40.057850\",\"latitude\":\"116.306945\"},{\"longitude\":\"40.057756\",\"latitude\":\"116.306915\"},{\"longitude\":\"40.057225\",\"latitude\":\"116.307164\"},{\"longitude\":\"40.056134\",\"latitude\":\"116.307546\"},{\"longitude\":\"40.055879\",\"latitude\":\"116.307636\"},{\"longitude\":\"40.055826\",\"latitude\":\"116.307697\"}]}";
		String s2 = "{\"point\":[{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421},{\"longitude\":116.343794,\"latitude\":39.956421}]}";

		// bublleSort(ary);
		// selectionSort(ary);
		// for (int i = 0; i < ary.length; i++) {
		// System.out.println(ary[i]);
		// }

		// revertChar(defStr2);

		// revertWord(defValue);
		// optimizaStr2(defStr2);
		StringBuilder pars = new StringBuilder();
		pars.append("key:value,key:value,");
		String s = pars.toString();
		System.out.println(s.length());
		int lastIndex = pars.lastIndexOf(",");
		System.out.println("lastIndex:" + lastIndex);
		System.out.println("replaceReuslt:" + pars.toString());
		System.out.println("-------->|" + (-1 | 0));
		System.out.println(s);
	}

	/**
	 * 递归测试
	 * 
	 * @param par
	 * @return
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
	 *      * 数组a中只有一个数出现一次，其他数都出现了2次，找出这个数字      * @param a      * @return
	 *      
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
	public static void optimizaStr2(String str) {
		TreeSet<String> set = new TreeSet<String>();
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
		int temp = 0;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 1; j < ary.length; j++) {
				if (ary[j - 1] > ary[j]) {
					temp = ary[j - 1];
					ary[j - 1] = ary[j];
					ary[j] = temp;
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
	 * @param intArr
	 *            被排序的数组
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
	 * 查找单独存在的整数 亦或运算:二进制运算相同为0不同为1 例：1,1,2,3,2 结果为3
	 * 
	 * @param ary
	 * @return
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
	 * 
	 * @param ary
	 * @return
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
	 * 
	 * @param ary
	 * @return
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

package design_proxy;

public class Test {
	public static void main(String[] args) {
		IImage image = new ProxyImage("test_.jpg");
		// 图片从磁盘加载
		image.display();
		System.out.println("--------------");
		// 图片将无法从磁盘加载
		image.display();
	}
}

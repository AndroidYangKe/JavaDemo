package design_proxy;

public class RealImage implements IImage{
	
	private String fileName;
	
	public RealImage(String fileNmae) {
		// TODO Auto-generated constructor stub
		this.fileName = fileNmae;
		loadFromDisk(fileNmae);
	}
	
	private void loadFromDisk(String fileNmae) {
		// TODO Auto-generated method stub
		System.out.println("loading " + fileNmae);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("displaying " + fileName);
	}

}

package test01;

public class Javatest01 {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Javatest01 obj = new Javatest01();
		obj.setName("ȫ�浿");
		System.out.println(obj.getName());
	}
}

package test.one;

public class People {

	public String name;
	public String age;
	public People(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public People() {
		super();
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}
	
	
}

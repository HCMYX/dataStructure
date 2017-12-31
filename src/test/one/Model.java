package test.one;

public class Model {
	public String id;
	public String name;
	public People people;
	public Model(String id, String name, People people) {
		super();
		this.id = id;
		this.name = name;
		this.people = people;
	}
	public Model() {
		super();
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", people=" + people.toString()
				+ "]";
	}

}

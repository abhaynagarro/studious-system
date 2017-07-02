package abhay.java8.model;

public class Person {

	private String name;
	private String address;
	private String company;
	private int age;

	public Person(String name, String address, String company, int age) {
		super();
		this.name = name;
		this.address = address;
		this.company = company;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", company=" + company + ", age=" + age + "]";
	}

}

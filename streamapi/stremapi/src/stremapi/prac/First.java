package stremapi.prac;

public class First {

	private String name;
	private String addr;
	private String zipcode;
	private float salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "First [name=" + name + ", addr=" + addr + ", zipcode=" + zipcode + ", salary=" + salary + "]";
	}

	public First(String name, String addr, String zipcode, float salary) {
		super();
		this.name = name;
		this.addr = addr;
		this.zipcode = zipcode;
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}

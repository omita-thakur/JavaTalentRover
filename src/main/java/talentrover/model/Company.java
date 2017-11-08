package talentrover.model;

public class Company {
	
	private String name;

	private Integer age;
	
	private String address;
	
	//private Integer salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/*public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}*/
	
	@Override
	 public String toString() {
	  return "Company [name=" + name
	    + ", age=" + age + ", address=" + address
	    +"]"; /*, salary=" + salary + "*/
	 }

}

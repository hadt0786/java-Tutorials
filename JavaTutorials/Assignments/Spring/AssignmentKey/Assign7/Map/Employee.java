
public class Employee {
	int age;
	String name;
	String add;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public String toString(){
		return "Name : " + name + " Age : " + age + " Address : " + add;
	}
}


public class Employee {
	
	int id;
	String department;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void employeeDetails(){
		System.out.println("id : " + id +" department : " + department);
	}
}

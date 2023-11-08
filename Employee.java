package sample;

public class Employee {
	private String name;
	private int age;
	private int id;
	private String gender;
	private int salary;
	private long mobileNo;
	
	public void setName(String name) {
		this.name=name;
	} public String getName() {
		return name;
	} public void setAge(int age) {
		this.age=age;
	} public int getAge() {
		return age;
	} public void setId(int id) {
		this.id=id;
	} public int getId() {
		return id;
	} public void setGender(String gender) {
		this.gender=gender;
	} public String getGender() {
		return gender;
	} public void setSalary(int salary) {
		this.salary=salary;
	} public int getSalary() {
		return salary;
	} public void setMobileNo(long mobileNo) {
		this.mobileNo=mobileNo;
	} public long getMobileNo() {
		return mobileNo;
	}
	public Employee(String name,int age,int id,String gender,int salary,long mobileNo) {
		this.name=name;
		this.age=age;
		this.id=id;
		this.gender=gender;
		this.salary=salary;
		this.mobileNo=mobileNo;
	}
	public String toString() {
		return "name="+name+","+"Age="+age+","+"Id="+id+","+"gender="+gender+","+"Salary="+salary+","+"MobileNo="+mobileNo;
	}

}

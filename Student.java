package sample;

public class Student {
	private String name;
	private int id;
	private int age;
	private String gender;
	private int fees;
	private String sec;
	private String std;
	
	public void setName(String name) {
		this.name=name;
	} public String getName() {
		return name;
	} public void setId(int id) {
		this.id=id;
	} public int getId() {
		return id;
	} public void setAge(int age) {
		this.age=age;
	} public int getAge() {
		return age;
	} public void setGender(String gender) {
		this.gender=gender;
	} public String getGender() {
		return gender;
	} public void setFees(int fees) {
		this.fees=fees;
	} public int getFees() {
		return fees;
	} public void setSec(String sec) {
		this.sec=sec;
	} public String getSec() {
		return sec;
	}
	public void setStd(String std) {
		this.std=std;
	}
	public String getStd() {
		return std;
	
	}
	public Student(String name,int age,int id,String gender,int fees,String sec,String std) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.fees=fees;
		this.sec=sec;
		this.std=std;
	}
	public String toString() {
		return name+","+age+","+gender+","+fees+","+sec+","+std;
	}

}

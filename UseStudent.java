package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
			Student s1= new Student("maha",1110,15,"female",25000,"A","I");
			Student s2= new Student("sai",1252,16,"male",26000,"B","II");
			Student s3= new Student("niro",2363,19,"female",32000,"C","III");
			Student s4= new Student("padhu",1564,18,"female",35000,"D","IV");
			Student s5= new Student("Roobi",25695,22,"female",45000,"E","V");
			Student s6= new Student("raj",1569,20,"male",55000,"F","VI");
			Student s7= new Student("Sethu",2589,14,"male",65000,"G","VII");
			Student s8= new Student("priya",1256,25,"female",75000,"H","VIII");
			Student s9= new Student("Kumar",1365,23,"male",25000,"I","IX");
			Student s10= new Student("raj",3698,27,"male",105000,"J","X");
			ArrayList<Student> students = new ArrayList<>();
			students.add(s1);
			students.add(s2);
			students.add(s3);
			students.add(s4);
			students.add(s5);
			students.add(s6);
			students.add(s7);
			students.add(s8);
			students.add(s9);
			students.add(s10);
			List<Student> malestd = students.stream().filter(x -> x.getGender().equalsIgnoreCase("male"))
		            	.collect(Collectors.toList());
			System.out.println(malestd);
			
			long femalecount = students.stream().filter(y -> y.getGender().equalsIgnoreCase("female")).count();
			System.out.println(femalecount);
			
			List<Student> feesStd = students.stream().filter(x -> x.getFees()>=25000&&x.getFees()<=50000).collect(Collectors.toList());
			System.out.println(feesStd);
	}
}
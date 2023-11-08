package sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseEmployee2 {
	public static void main(String[] args) {
		Employee e1=new Employee("priya",23,150028,"female",50000,7339607679l);
		Employee e2=new Employee("Niro",19,15856,"female",25000,8596571333l);
		Employee e3=new Employee("Sai",35,14583,"male",158000,6369465487l);
		Employee e4=new Employee("Prasanna",25,11526,"male",35500,9597966699l);
		Employee e5=new Employee("Roobi",29,12856,"female",28000,9865412365l);
		Employee e6=new Employee("Padhu",39,156680,"female",450000,8864521025l);
		Employee e7=new Employee("raj",25,18756,"male",284560,7896412505l);
		Employee e8=new Employee("Prathi",25,2556,"male",350000,7896324153l);
		Employee e9=new Employee("vinoth",26,35696,"male",480000,7369456850l);
		Employee e10=new Employee("frank",30,85696,"male",450000,7869325461l);
		/*Set<Employee>li=new TreeSet<>();*/
		ArrayList<Employee>li=new ArrayList<>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		li.add(e5);
		li.add(e6);
		li.add(e7);
		li.add(e8);
		li.add(e9);
		li.add(e10);
		li.add(e1);
		li.add(e8);
		
		List<Employee>femaleEmp=li.stream().filter(x->x.getGender().equalsIgnoreCase("female")).collect(Collectors.toList());
		System.out.println(femaleEmp);
		long femaleCount=li.stream().filter(y->y.getGender().equalsIgnoreCase("female")).count();
		System.out.println(femaleCount);
		List<Employee>salaryEmp=li.stream().filter(x->x.getSalary()>=20000).collect(Collectors.toList());
		System.out.println(salaryEmp);
		
		List<Boolean>empMap=li.stream().map(x->x.getAge()>25).collect(Collectors.toList());
		System.out.println(empMap);
		
		
		
		/*li.forEach(System.out::println);*/
		
		
		
	}

}

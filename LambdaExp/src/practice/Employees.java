package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp{
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearofjoin;
	double salary;
	
	public Emp(int id, String name, int age, String gender, String department, int yearofjoin, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearofjoin = yearofjoin;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
		public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getDepartment() {
		return department;
	}
	
	public int getYearofjoin() {
		return yearofjoin;
	}
	
	public double getSalary() {
		return salary;
	}
	
	/*@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department=" + department
				+ ", yearofjoin=" + yearofjoin + ", salary=" + salary + "]";
	}*/
	
}



public class Employees {

	public static void main(String[] args) {
		List<Emp>emplist=new ArrayList<Emp>();
		emplist.add(new Emp(101,"Tom",21,"Male","IT",2017,85000));
		emplist.add(new Emp(102,"Tim",22,"Male","HR",2018,95000));
		emplist.add(new Emp(103,"Johny",24,"Male","PR",2016,105000));
		emplist.add(new Emp(108,"Stealla",25,"Female","Security",2015,115000));
		emplist.add(new Emp(109,"Nikky",24,"Female","Infrastructure",2019,98000));
		
		Stream<Emp>data=emplist.stream();
		//List<Emp> avg=data.filter(e->e.getName().startsWith("S")).collect(Collectors.toList());
		//System.out.println(avg);
		
		/*List<Emp> Dep=data.filter(e->e.getSalary()>85000).collect(Collectors.toList());
		System.out.println(Dep);
		
		List<Emp> FemEmp=data.filter(e->e.getGender()=="Female").collect(Collectors.toList());
		System.out.println(FemEmp);
		
		// Getting the names of those employees who joined after 2016.
		List<String>Names=data.filter(e->e.getYearofjoin()>2016).map(Emp::getName).collect(Collectors.toList());
			System.out.println(Names);
		
		// Getting the names of those person whose salary is more than 90000;
		List<String>SalName=data.filter(e->e.getSalary()>100000).map(Emp::getName).collect(Collectors.toList());
		System.out.println(SalName);
		
		// Getting the names of all the departments.
		List<String>DepName=data.map(Emp::getDepartment).collect(Collectors.toList());
		System.out.println(DepName);
		
		// Getting the average salary of all the employees.
		double AvgSal=data.mapToDouble(Emp::getSalary).average().orElse(0);
		System.out.println("The Average Salary is:"+AvgSal);
		
		// Getting the Name of the person with Maximum Salary.
		Optional<String> Name=data.max(Comparator.comparing(Emp::getSalary)).map(Emp::getName);
		System.out.println(Name);
		
		
		// Getting the sum of salary of all employees.
		double TotSal=data.mapToDouble(Emp::getSalary).sum();
		System.out.println(TotSal);
		
		// Getting the Id of all the employee.
		List<Integer>ID=data.map(Emp::getId).collect(Collectors.toList());
		System.out.println(ID);
		
		// Getting the Name of the person with Maximum Salary.
		Optional<Integer>MaxId=data.max(Comparator.comparing(Emp::getId)).map(Emp::getId);
		System.out.println(MaxId);
		
		// Getting the Name of the person with Maximum Salary.
		Optional<String>NameMaxId=data.max(Comparator.comparing(Emp::getId)).map(Emp::getName);
		System.out.println(NameMaxId.get());
		
		// Getting the Names of those employees which are less than 24.
		List<String>Names=data.filter(e->e.getAge()<23).map(Emp::getName).collect(Collectors.toList());
		System.out.println(Names);*/
		
		// Getting the average age of all employees.
		double AvgAge=data.mapToDouble(Emp::getAge).average().orElse(0);
		System.out.println(AvgAge);

		
		
	}
	

}

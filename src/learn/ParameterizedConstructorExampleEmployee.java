package learn;

public class ParameterizedConstructorExampleEmployee {

	int empId;
	String empName;
	
	//Parameterized Constructor Example
	public ParameterizedConstructorExampleEmployee(int id, String name) {
	this.empId=id;
	this.empName=name;
	}
	
	void print() {
		System.out.println("Id="+empId+" Name="+empName);
	}
	
	public static void main(String[] args) {
		ParameterizedConstructorExampleEmployee obj1=new ParameterizedConstructorExampleEmployee(20102,"Chaitanya");
		ParameterizedConstructorExampleEmployee obj2=new ParameterizedConstructorExampleEmployee(61009,"Divya");
		
		//System.out.println("Id="+obj1.empId+"  Name="+obj1.empName);
		//System.out.println("Id="+obj2.empId+"  Name="+obj2.empName);
		//We can do this or we can make method (Funtion) of print statement.
		obj1.print();
		obj2.print();
	}

}

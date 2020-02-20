package learn;

public class LocalVarExample {
	public String myVar="Hello";
	
	public void myMethod() {
		//local variable
		String myVar="MethodHello";
		System.out.println(myVar);
	}
	public static void main(String[] args) {
		LocalVarExample obj= new LocalVarExample();
		System.out.println("Main Hello");
		
		System.out.println(obj.myVar);
		
		obj.myMethod();

	}

}

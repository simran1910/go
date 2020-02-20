package learn;

public class InstanceVarExample {
	public String myInstanceVar="Hello";
	public static void main(String[] args) {
		InstanceVarExample obj1=new InstanceVarExample();
		InstanceVarExample obj2=new InstanceVarExample();
		InstanceVarExample obj3=new InstanceVarExample();
		
		System.out.println(obj1.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
		
		obj2.myInstanceVar="Changed to Hi";
		
		System.out.println(obj1.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
		
	}

}

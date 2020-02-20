package learn;

public class StaticVarExample {
	public static String myClassVar= "Hello";

	public static void main(String[] args) {
		StaticVarExample obj1= new StaticVarExample();
		StaticVarExample obj2= new StaticVarExample();
		StaticVarExample obj3= new StaticVarExample();

		//All 3 will display Hello
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
		
		obj2.myClassVar="Changed to Hi";
		//All 3 will display Changed to Hi
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
	}

}

package learn;

public class ClassExample {
/*Let the ClassExample be renamed as Website. Here we have a class Website(let) that has
	two data members (also known as fields, instance variables and object states).*/
	
	//Instance variable
	String webName;
	int webAge;
	
	//constructor
	ClassExample(String name, int age) {
		this.webName= name;
		this.webAge= age;
	}
	
	/* public int getValue()
     {
             return webAge;
     }*/
	 
	
	public static void main(String[] args) {
		
		//Creating Object
		ClassExample obj1=new ClassExample("Java Tutorial",10);
		ClassExample obj2=new ClassExample("Google",20);
		
		//Accessing object data
		System.out.println(obj1.webName+ " " +obj1.webAge);
		System.out.println(obj2.webName+ " "+obj2.webAge);
		//System.out.println(obj2.getValue());

	}

}

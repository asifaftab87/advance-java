package first;

public class Boy {

	String name;
	int age;
	float weight;
	char gender;
	
	public void create(String nm, int a, float wt, char g) {
		name = nm;
		age = a;
		weight = wt;
		gender = g;
	}
	
	public void display() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("weight: "+weight);
		System.out.println("gender: "+gender);
	}
}

package Assignment;

class A {//base class of derived class B
	public void show() {
		 System.out.println("Class 1");
	 }
}

class B extends Problem2{//derived class from A and base class for class C
	public void show1() {
		 System.out.println("Class 2");
	 }
}

class C extends B{//derived class from B
	public void show2() {
		 System.out.println("Class 3");
	 }
}

public class Problem2{
	public static void main(String args[]) {
		C obj=new C();
		//obj.show();
		obj.show1();
		obj.show2();
		
	}
}
// Problem 2;
// this type of Inheritance is called as Multi-level Inheritance
// Example is given below


package Assignments;
class Class_A {//base class
    public void paste()
    {
        System.out.println("hi");
    }
}
 
class Class_B extends Class_A {// 2nd class which is also the base class for the 3rd class
    public void paste2() 
    {
    	System.out.println("hello");
    }
}
 
class Class_C extends Class_B {//3rd class
    public void paste3()
    {
        System.out.println("how are you");
    }
}
 
// Derived class
public class Multiinheritance {
    public static void main(String[] args)
    {
        Class_C C = new Class_C();
        C.paste();
        C.paste2();
        C.paste3();
    }
}



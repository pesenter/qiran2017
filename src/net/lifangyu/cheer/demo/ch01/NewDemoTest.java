package net.lifangyu.cheer.demo.ch01;

public class NewDemoTest {
	public static void main(String[] args){
		Parent p =new  Parent();
		child c = new child();
		 System.out.println(p);
	}
}
class Parent{
	public Parent(){
		System.out.println("call Parent new method");
	}
}
class child extends Parent{
	 public child(){
		 System.out.println("call child new method");
	 }
}




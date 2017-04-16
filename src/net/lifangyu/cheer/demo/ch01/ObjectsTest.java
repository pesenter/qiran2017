package net.lifangyu.cheer.demo.ch01;

public class ObjectsTest {

	public static void main(String[] args) {
		ReObjects ro = new ReObjects();
		ro.Values();
		ReObjects b = ro;
		b.equal();
	}
 
}

class ReObjects{
	
}

class Compare{
	private int value;
	
}
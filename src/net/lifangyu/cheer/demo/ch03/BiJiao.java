package net.lifangyu.cheer.demo.ch03;

public class BiJiao {

	public static void main(String[] args) {
		String s1 = new String("abcd");
		String s2 = new String("abcd");
		String s3 = s1;
		
		System.out.println("s2==s3��������Ϊ��"+(s2==s3));
		System.out.println("c2.equals(c3)��������Ϊ"+(s2.equals(s3)));
	}
}

package net.lifangyu.cheer.demo.ch01;

public class ShuzuBijiao {

	public static void main(String[] args) {
		int [] values = new int[6];
		values[0] = 12;
		values[1] = 14;
		values[2] = 11;
		values[3] = 18;
		values[4] = 15;
		values[5] = 16;
		int max=-1;
		for(int value:values){
			if(value > max){
				max = value;
			}
		}
		System.out.println(max);
	}

}

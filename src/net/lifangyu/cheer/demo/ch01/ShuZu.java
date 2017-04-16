package net.lifangyu.cheer.demo.ch01;

public class ShuZu {
	public static void main(String[] args){
		int [] values = new int[6];
		values[0] = 8;
		values[1] = 39;
		values[2] = 17;
		values[3] = 78;
		values[4] = 82;
		values[5] = 52;
		
		int max = -1;
		int maxIndex = -1;
		for(int i =0;i<values.length;i++){
			int value = values[i];
			if(value > max){
				max = value;
				maxIndex = i;
			}
		}
		int temp = values[values.length-1];
		values[values.length-1] = max;
		values[maxIndex] = temp;
	
	}
}

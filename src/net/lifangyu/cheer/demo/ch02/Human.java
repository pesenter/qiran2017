package net.lifangyu.cheer.demo.ch02;

public class Human {

		private int value=0;
		public Human(){
			this(100);
		}
		
		public final void abc(){
			
		}
		
		public Human(int i){
			this.value = i;
			System.out.println("call Human new method");
		}
		
		public String toString(){
			return ""+value;
		}
		
	}




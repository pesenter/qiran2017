package net.lifangyu.cheer.demo.ch03;

public class LeiDiaoyong {
	int i = 27;
	public void call(){
		System.out.println("call����");
		for(i=0; i<10; i++){
			System.out.println(i+" ");
			if(i==2){
				System.out.println("\n");
			}
		}
	}
	public LeiDiaoyong(){
		
	}
	public static void main(String[] args) {
		LeiDiaoyong s1 = new LeiDiaoyong();
		LeiDiaoyong s2 = new LeiDiaoyong();
		s2.i = 20;
		System.out.println("���õ�һ������i:" +s1.i++ );
		s1.call();
		System.out.println("���õڶ�������i��" +s2.i);
		s2.call();
	}

}

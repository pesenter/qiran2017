package net.lifangyu.cheer.demo.ch01;

import java.util.Date;

public class LeiTest{
		abstract class Lei {
			private String name;
			private int age;
 			public Date getBirthday() {
				return birthday;
			}

			public void setBirthday(Date birthday) {
				this.birthday = birthday;
			}
			private Date birthday;
			public void setName(String name){
			this.name = name;
			}
				
			public String getName(){
				return name;
			}
			
			public void setAge(int age){
				this.age = age;
			}	
			public int getAge(){
				return age;
			}	 
		
		
		}
}
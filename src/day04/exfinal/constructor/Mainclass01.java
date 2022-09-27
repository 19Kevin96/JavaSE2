package day04.exfinal.constructor;

import day04.exfinal.constructor.mypac.Handphone;

/*
 * [[생성자(Constructor)]]
 * 	객체를 생성할 때 호출하는 반환값이 없는 메솓,. 정확히는 메소드가 아니다.
 * 
 * 
 * 
 * 
 */

public class Mainclass01 {
		public static void main(String[] args) {
			
		Handphone hp = new Handphone();
		
		Handphone hp2 = new Handphone("Iphone");
		
		System.out.println("hp.model:"+hp.model);
		
		System.out.println("hp.model:"+hp2.model);
		}
		
}
		


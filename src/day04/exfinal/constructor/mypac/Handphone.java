package day04.exfinal.constructor.mypac;

public class Handphone {
	
	public String model;
	
	// 디폴트 생성자
	public Handphone() {
		this.model = "Galuxy";
		System.out.println("디폴트 생성자가 호출되었습니다.");
	} 

	public Handphone(String name) {
		this.model = name;
		System.out.println("생성자로 " + name + "이 전달되었습니다");

	}
}

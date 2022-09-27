package method.mypac;
/*
 *  오버로딩 (overloading)
 *  
 *  매개변수를 달리하여 중복(동일메소드명) 메소드를 선언할 수 있다.
 * 
 * 
 */
public class Mainclass03 {
	
	public static void main(String[] args) {
		
		Mathtest mt = new Mathtest();
		
		int result = mt.sum(5,3,2);
		System.out.println("모든 수의 합계:"+ result);
		
		int[] arrNums = {5,3,2,6};
		int result2 = mt.total(arrNums);
		
		System.out.println("총 합계:"+ result2);
		
		int result3 = mt.sum(1,2);
		System.out.println("result3 : "+ result3);
		
		int result4 = mt.sum("7", "3");
		System.out.println("result4 : " + result4);
		
	}
}

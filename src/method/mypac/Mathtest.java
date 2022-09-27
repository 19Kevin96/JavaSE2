package method.mypac;

public class Mathtest {

	public double getArea(int r) {
		final double PI = 3.141592; //원주율
		
		//원의 넓이
		double area= PI*r*r;
		return area;
	}
		public int sum(int a, int b, int c) {
			int resultNum = a + b + c;
			return resultNum;
		}
		
		public int sum(int a, int b) {
			int resultNum = a + b ;
			return resultNum;
		}
		
		public int sum(String a, String b) {
			
			int resultNum =Integer.parseInt(a) + Integer.parseInt (b) ;
			
			return resultNum;
		}
	
		public int total(int[] nums) {
			int result = 0;
			
			for (int i = 0; i<nums. length; i++) {
				result += nums[i];
			}
			
			return result;
		}
}

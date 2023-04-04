package level1;
public class Discount {
	
	public int solution(int price, String grade) {
		// Write code here.
		double answer = 0;
		
		if ( grade.equals("S")) {
			return (int)(price - (price * 0.05));
		} else if ( grade.equals("G")) {
			return (int)(price - (price * 0.1));
		} else if ( grade.equals("V")) {
			return (int)(price - (price * 0.15));
		}
		
		return (int)answer;
	}
	
	// The following is main method to output testcase.
	public static void main(String[] args) {
		Discount d = new Discount();
		int price1 = 2500;
		String grade1 = new String("V");
		int ret1 = d.solution(price1, grade1);
		
		System.out.println("Solution: return value of the method is "+ret1+".");
		
		int price2 = 96900;
		String grade2 = new String("S");
		int ret2 = d.solution(price2, grade2);
		System.out.println("Solution: return value of the method is "+ret2+" .");
	}
}

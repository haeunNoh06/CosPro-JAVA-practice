package part2;

public class EvenSquare {

	public int solution(int N, int M) {
		int total = 0;
		
		for ( int i = Math.min(N, M); i <= Math.max(N, M); i++) {
			if ( i % 2 == 0)
				total += i*i;
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		EvenSquare e = new EvenSquare();
		int N = 4;
		int M = 7;
		int ret = e.solution(N, M);
		
		System.out.println("Solution : "+ret+".");
	}

}

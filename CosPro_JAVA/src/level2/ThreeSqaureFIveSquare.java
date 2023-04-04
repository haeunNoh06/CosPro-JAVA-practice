package level2;

public class ThreeSqaureFIveSquare {

	// 5의 배수 구하기
	public int func_a(int[] arr) {
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if ( arr[i] % 5 == 0) count++;
		}
		
		return count;
	}
	
	// 무엇이 더 큰 수인지 파악
	public String func_b(int three, int five) {
		String answer = "";
		if ( three == five ) answer = "same";
		else if ( three > five) answer = "three";
		else if ( three < five ) answer = "five";
		
		return answer;
	}
	
	// 3의 배수 구하기
	public int func_c(int[] arr) {
		int count = 0;
		
		for ( int i = 0; i < arr.length; i++) {
			if ( arr[i] % 3 == 0) count++;
		}
		
		return count;
	}
	
	public String solution(int[] arr) {
		int countThree = func_c(arr);
		int countFive = func_a(arr);
		String answer = func_b(countThree, countFive);
		return answer;
	}
	
	public static void main(String[] args) {
		ThreeSqaureFIveSquare t = new ThreeSqaureFIveSquare();
		int[] arr = {2,3,6,9,12,15,10,20,22,25};
		String ret = t.solution(arr);
		
		System.out.println("solution 메서드의 반환 값은 "+ret+"입니다.");
	}

}

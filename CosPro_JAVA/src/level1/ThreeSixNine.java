package level1;

public class ThreeSixNine {

	public int solution(int number) {
		
		int count = 0;// 3의 배수 카운트
		
		for (int i = 1; i <= number; i++) {
			int current = i;// 현재 수
			int temp = count;// 수를 출력해보기 위함
			while ( current != 0) {
				if ( current%10 == 3 || current%10 == 6 || current%10 == 9 ) {
					count++;
					System.out.print("pair ");
				}
				current /= 10;// 십의 자리 수도 3의 배수인지를 확인하기 위해
			}
			System.out.println();
			if ( temp == count )
				System.out.print(i);// 3의 배수가 들어있지 않은 수 출력
			System.out.print(" ");
		}
		System.out.println();
		
		return count;
	}
	
	public static void main(String[] args) {

		ThreeSixNine t = new ThreeSixNine();
		int number = 40;
		int ret = t.solution(number);
		
		System.out.println("Solution: return value of the method is "+ret);
	}

}
 
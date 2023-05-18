package part3;

public class Devide {

	public int solution(int[] arr) {
		int answer = 0;
		for ( int i = 0; i < arr.length; i++) {
			for ( int j = 0; j < arr.length; j++)
				if ( arr[i]/2.0 == arr[j] ) {
					answer++;
					break;
				}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Devide d = new Devide();
		int[] arr = {4,8,3,6,7};
		int ret = d.solution(arr);
		System.out.println("solution 메서드의 반환값은 "+ret+"입니다.");
	}

}

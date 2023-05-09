package part3;

public class Average {
	public int solution(int[] scores) {
		int answer = 0;
		int max = 0;
		int min = 100;
		int sum = 0;
		for (int i = 0 ; i < scores.length; i++) {
			// 최대값
			if ( max < scores[i])
				max = scores[i];
			// 최소값
			if ( min > scores[i])
				min = scores[i];
			// 누적하기
			sum += scores[i];
		}
		answer = (sum-min-max)/(scores.length-2);
		return answer;
	}
	
	public static void main(String[] args) {
        Average a = new Average();
        int[] scores1 = {35, 28, 98, 34, 20, 50, 85, 74, 71, 7};
        int ret1 = a.solution(scores1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int[] scores2 = {1, 1, 1, 1, 1};
        int ret2 = a.solution(scores2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }

}
package part6;

import java.util.Arrays;

public class Uniform {

	public int[] solution(int[] people) {
        int[] answer = new int[4];
				for ( int p : people ) {
					if ( p < 95 )
						answer[0]++;
					else if ( p < 100 )
						answer[1]++;
					else if ( p < 105 )
						answer[2]++;
					else
						answer[3]++;
				}
        return answer;
    }
	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Uniform sol = new Uniform();
        int[] people = {97, 102, 93, 100, 107};
        int[] ret = sol.solution(people);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}

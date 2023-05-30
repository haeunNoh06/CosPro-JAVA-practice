package part4;

/*=======================================================
 * 4차시 10번 : 4차 2급 10_initial_code.java
 =========================================================*/
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Cutline {
    public int solution(int[] scores, int cutline) {
        int answer = 0;
        for ( int i = 0; i < scores.length; i++) {
        	if ( scores[i] >= cutline )
        		answer++;
        }
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Cutline sol = new Cutline();
        int[] scores = {80, 90, 55, 60, 59};
        int cutline = 60;
        int ret = sol.solution(scores, cutline);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
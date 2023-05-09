package part2;

public class CandidateVote {

	public int solution(int[] votes, int N, int K) {
        int[] counter = new int[N + 1];// 0번방은 안 쓴다는 뜻
        for(int i = 0; i < votes.length; ++i)
        	counter[votes[i]]++;
        int answer = 0;
        for(int i = 0; i <= N; ++i)
            if( counter[i] == K)
                answer += 1;
        return answer;
    }
	
	public static void main(String[] args) {
		CandidateVote cv = new CandidateVote();
		
		int[] votes = {2, 5, 3, 4, 1, 5, 1, 5, 5, 3};
        int N = 5;
        int K = 2;
        int ret = cv.solution(votes, N, K);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}

}

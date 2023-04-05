package level2;

public class StringSum {

	public String solution(String[] words) {
		String answer = "";
		
		for ( int i = 0; i < words.length; i++) {
			if ( words[i].length() >= 5 )
				answer += words[i];
		}
		
		if (answer.length() == 0) answer = "empty";
		
		return answer;
	}
	
	public static void main(String[] args) {
		StringSum s = new StringSum();
		String[] words = {"my", "favorite", "color", "is", "violet"};
		String ret1 = s.solution(words);
		
		System.out.println("Solution : "+ret1);
		
		String[] words2 = {"yes","i","am"};
		String ret2 = s.solution(words2);
		
		System.out.println("Solution : "+ret2);
		
	}

}

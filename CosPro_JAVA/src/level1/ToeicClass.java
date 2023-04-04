package level1;

public class ToeicClass {

	public int solution(int[] score) {
		int count = 0;
		
		for ( int i = 0; i < score.length; i++) {
			if ( score[i] >= 650 && score[i] < 800 )
				count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		ToeicClass t = new ToeicClass();
		int[] scores = {650, 722, 914, 558, 714, 803, 650, 679, 669, 800};
		int ret = t.solution(scores);
		System.out.println("Solution: return value of the method is "+ret+".");
	}

}

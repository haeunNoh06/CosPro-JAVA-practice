package level1;
import java.util.Arrays;
import java.util.Scanner;

public class Population {

	public static String solution(String[] group, int[] personLike) {

		int max = personLike[0];
		int room = 0, i;
		for ( i = 1; i < personLike.length; i++ ) {
			if ( max < personLike[i]) {
				max = personLike[i];
				room = i;
			}
		}
		
		return group[room];
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] group = {"뉴진스", "스테이씨", "블랙핑크", "엔믹스"};
		int[] personLike = new int[group.length];

		for (int i = 0; i < group.length; i++) {
			System.out.print(group[i]+"이(가) 좋은 사람 수 >> ");
			personLike[i] = scan.nextInt();
		}
		
		Population p = new Population();
		p.solution(group, personLike);

		System.out.println("Solution: return value of the method is " + p.solution(group, personLike));
	}

}

package part1;
import java.util.Scanner;
import java.util.Arrays;

public class ShirtSize {

    public int[] solution(String[] shirtSize) {
        String[] answer = {"XS", "S", "M", "L", "XL", "XXL"};
				int[] cnt = new int[answer.length];
				for ( int i = 0; i < answer.length; i++) {
					for ( int j = 0; j < shirtSize.length; j++) {
						if ( answer[i].equals(shirtSize[j])) {
							cnt[i]++;
						}
					}
				}
        return cnt;
    }
	
    public static void main(String[] args) {
        ShirtSize sol = new ShirtSize();
        String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
        int[] ret = sol.solution(shirtSize);
 
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }

}

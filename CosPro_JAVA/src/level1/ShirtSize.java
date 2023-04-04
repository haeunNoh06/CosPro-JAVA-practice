package level1;
import java.util.Scanner;
import java.util.Arrays;

public class ShirtSize {

	public static int[] solution(String[] shirtSize) {
		
		int[] sizeCnt = {0,0,0,0,0,0};
		
		for ( int i = 0; i < shirtSize.length; i++ ) {
			
			if ( shirtSize[i].equals("XS"))
				sizeCnt[0]++;
			else if ( shirtSize[i].equals("S"))
				sizeCnt[1]++;
			else if ( shirtSize[i].equals("M"))
				sizeCnt[2]++;
			else if ( shirtSize[i].equals("L"))
				sizeCnt[3]++;
			else if ( shirtSize[i].equals("XL"))
				sizeCnt[4]++;
			else if ( shirtSize[i].equals("XXL"))
				sizeCnt[5]++;
		}
		
		return sizeCnt;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수 입력 : ");
		int studentCnt = scan.nextInt();
		String[] shirtSize = new String[studentCnt];
		
		for (int i = 0; i < shirtSize.length; i++) {
			shirtSize[i] = scan.next();
		}
		
		System.out.println("Solution: return value of the method is "
		+Arrays.toString(solution(shirtSize)));
	}

}

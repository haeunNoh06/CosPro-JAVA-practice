package part1;
import java.util.Arrays;

public class ReplaceArray {

	public int[] solution(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		
		for ( int i = 0; i < arr.length/2; i++) {
			if ( right <= left ) break;
			int tmp = arr[left];
			arr[left] = arr[right];
			arr[right] = tmp;
			right--;
			left++;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		ReplaceArray r = new ReplaceArray();
		int[] arr = {1,4,2,3};
		int[] ret = r.solution(arr);
		
		System.out.println(Arrays.toString(ret));
	}

}

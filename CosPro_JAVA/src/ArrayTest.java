
public class ArrayTest {

	public static void main(String[] args) {
		
		String[] a = "Practice makes perfect.".split("");
		char[][] b = {{'A'},{'A','B','C'},{'A','B','C','D','E'},{'A','B','C','D','E','F','G'},{'A','B','C','D','E','F','G','H','I'}};
//		char[][] b = {{"A"},{"A","B","C"},{"A","B","C","D","E"},{"A','B','C','D','E','F','G'},{'A','B','C','D','E','F','G','H','I'};
			
		for ( int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
		System.out.println();
		System.out.println();
		
		for ( int i =  a.length-1; i >= 0; i--) {
			System.out.print(a[i]);
		}
		
		System.out.println();
		System.out.println();
		
		for ( int i = 0; i < a.length; i++) {
			if ( a[i].equals(" ")) {
				System.out.println();
				continue;
			}
			System.out.print(a[i]);
		}
		
		System.out.println();
		System.out.println();
		
		int cnt1 = 1;
		for (int i = 0; i < b[4].length; i++) {
			for ( int j = 0; j < (4-i); j++) {
				System.out.print(" ");
			}
			for ( int j = 0; j < cnt1; j++) {
				System.out.print(b[4][j]);
			}
			if ( cnt1 >= 8 ) break;
			System.out.println();
			cnt1+=2;
		}
		
		System.out.println();
		System.out.println();
		
		int cnt2 = 0;
		for (int i = 0; i < b[4].length; i++) {
			for ( int j = b.length-cnt2; j >= 1; j--) {
				System.out.print(b[4][i]);
			}
			if ( i % 2 == 0) cnt2++;
			System.out.println();
		}
		
	}

}

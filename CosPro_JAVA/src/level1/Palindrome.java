package level1;

public class Palindrome {

	boolean solution(String sentence) {
		
		String[] s = sentence.split("");
		String p = "";
		for ( int i = 0; i < s.length; i++) {
			if ( s[i].equals(" "))
				continue;
			p += s[i];
		}
		int length = p.length();
		String[] result = p.split("");
		for (int i = 0; i < length/2; i++) {
			// 앞 뒤로 맞으면
			if ( result[i].equals(result[length-1-i]) ) {
				continue;
			}
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

		Palindrome p = new Palindrome();
		boolean ret = p.solution("never odd or even");
		System.out.println("is "+ret);

		boolean ret2 = p.solution("palindrome");
		System.out.println("is "+ret2);
		
		
	}

}

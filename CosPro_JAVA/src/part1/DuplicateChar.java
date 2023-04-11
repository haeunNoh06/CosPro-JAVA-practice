package part1;

public class DuplicateChar {

	public String solution(String characters) {
		String result = "";
		result += characters.charAt(0);
		System.out.println(characters.length());
		for ( int i = 0; i < characters.length()-1; i++) {
			if ( characters.charAt(i) != characters.charAt(i+1))
				result += characters.charAt(i+1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		DuplicateChar d = new DuplicateChar();
		String characters = "senteeeeeenccccccccccccceeeeeee";
		String ret = d.solution(characters);
		
		System.out.println("Solution: return value of the method is "+ret);
	}

}

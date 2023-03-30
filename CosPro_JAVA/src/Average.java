
public class Average {

	public int solution(int[] data) {
		double total = 0;
		int len = data.length;
		for ( int i = 0;i < len; i++)
			total += data[i];
		int cnt = 0;
		double average = total/len;
		for ( int i = 0;i < len; i++) {
			if ( data[i] <= average )
				cnt++;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Average a = new Average();
		int[] data1 = {1,2,3,4,5,6,7,8,9,10};
		int ret1 = a.solution(data1);
		
		System.out.println("Solution : "+ret1);
		
		int[] data2 = {1,1,1,1,1,1,1,1,1,10};
		int ret2 = a.solution(data2);
		
		System.out.println("Solution : "+ret2);
	}

}

package level1;
public class D_day {
	
	public int func_a(int month, int day) {
		int monthList[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
		for ( int i = 1; i < month; i++) {
			total += monthList[i-1];
		}
		total += day;
		
		
		return total - 1;
	}
	
	public int solution (int startMonth, int startDay, int endMonth, int endDay) {
		int startTotal = func_a(startMonth, startDay);
		int endTotal = func_a(endMonth, endDay);
		return endTotal - startTotal;
	}
	
	public static void main(String[] args) {
		D_day d = new D_day();
		int startMonth = 1;
		int startDay = 2;
		int endMonth = 2;
		int endDay = 2;
		int ret = d.solution(startMonth, startDay, endMonth, endDay);
		System.out.println("Solution: return value of the method is "+ret+".");
	}

}

package part6;

public class CardGame {

	public int solution(String[][] cards) {
        int answer = 0;
				if ( cards[0][0].equals(cards[1][0]) && cards[0][0].equals(cards[2][0]))
					return (Integer.parseInt(cards[0][1])+Integer.parseInt(cards[1][1])+Integer.parseInt(cards[2][1]))*3;
				else if ( cards[0][0].equals(cards[1][0])
								|| cards[2][0].equals(cards[0][0])
								|| cards[2][0].equals(cards[1][0]))
					return (Integer.parseInt(cards[0][1])+Integer.parseInt(cards[1][1])+Integer.parseInt(cards[2][1]))*2;
				else
        	return (Integer.parseInt(cards[0][1])+Integer.parseInt(cards[1][1])+Integer.parseInt(cards[2][1]));
    }
	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        CardGame sol = new CardGame();
        String[][] cards1 = {{new String("blue"), new String("2")}, {new String("red"), new String("5")}, {new String("black"), new String("3")}};
        int ret1 = sol.solution(cards1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[][] cards2 = {{new String("blue"), new String("2")}, {new String("blue"), new String("5")}, {new String("black"), new String("3")}};
        int ret2 = sol.solution(cards2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}

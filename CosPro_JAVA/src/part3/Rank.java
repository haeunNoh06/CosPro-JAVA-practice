package part3;

import java.util.*;

class Rank {

	  public int[] solution(int[] scores) {

	        int[] rank = new int[scores.length];
	        
	        for ( int i = 0; i < scores.length;i++)
	        	rank[i] = 0;
	        
	        for ( int i = 0; i < scores.length; i++) {
	        	for ( int j = 0; j < scores.length; j++) {
	        		if ( scores[i] <= scores[j])
	        			rank[i]++;
	        	}
	        }
	        
	        return rank;
	  }

	    public static void main(String[] args) {
	        Rank r = new Rank();
	        int[] scores = {20, 60, 98, 59};

	        int[] ret = r.solution(scores);

	        System.out.println("점수" + Arrays.toString(scores));

	        System.out.println("석차" + Arrays.toString(ret)); 

	    }


}

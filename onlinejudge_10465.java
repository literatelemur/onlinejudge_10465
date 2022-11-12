import java.util.*;
public class onlinejudge_10465 {
	public static void main(String[] args) {
		// Collecting Input.
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int m = input.nextInt();
			int n = input.nextInt();
			int t = input.nextInt();
			
			// Creating array to hold most number of burgers for each time up to t.
			int[] times = new int[t];
			for (int i = 0; i < t; i++) {
				int t1 = i;
				int burgs = 0;
				int low, high;
				
				// Determining which value is lower (and should be utilized to find the max).
				if (n <= m) {
					low = n;
					high = m;
				} else {
					high = n;
					low = m;
				}
				
				// Determining how many times the time is divisible by the low
				//	(and therefore how many burgers possible can be eaten in that time frame).
				while (t1 > 0) {
					t1 -= low;
					burgs++;
				}
				
				// Storing the max number of burgers eaten in the time leading up to and including t.
				times[i] = burgs;
				if (i == t - 1) {System.out.print(times[i]);}
			}
			System.out.println();
		}
	}

}


import java.util.*;
public class Solution {
	static int LongestFibonacci(int Arr[], int b) {

		TreeSet<Integer> S = new TreeSet<>();
		for (int t : Arr) {
			 
			S.add(t);
		}
		int maxLen = 0, x, y;

		for (int i = 0; i < b; ++i) {
			for (int j = i + 1; j < b; ++j) {

				x = Arr[j];
				y = Arr[i] + Arr[j];
				int len = 3;

				while (S.contains(y) && (y != S.last())) {

					int z = x + y;
					x = y;
					y = z;
					maxLen = Math.max(maxLen, ++len);
				}
			}
		}
		return maxLen >= 3 ? maxLen : 0;
	}

	public static void main(String[] args) {
		int arr[] = {1, 3, 7, 11 , 12 , 14 , 18};
		int b = arr.length;
		System.out.print(LongestFibonacci(arr, b));
	}
}

public class Main {

	public static void main(String[] args) {


		int[] tableIfInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 19}; // the table to search (shorted)

		int sum = 8; // the sum to find
		int i = 1;

		int hi = tableIfInts[tableIfInts.length - 1];
		int low = tableIfInts[0];

		System.out.println("init hi = " + hi);
		System.out.println("init low = " + low);

		while (low < hi) {
			int sumToCompare = low + hi;
			System.out.println("NEW sumToCompare = " + sumToCompare);
			if (sumToCompare == sum) {
				System.out.println("found the result " + hi + " , " + low);
				break;
			} else if (sumToCompare > sum) {
				hi = tableIfInts[tableIfInts.length - i];
				System.out.println("NEW hi = " + hi);
				i++;
			} else if (sumToCompare < sum) {
				low = tableIfInts[low + 1];
				System.out.println("NEW low = " + low);
			}
		}

		//find max number
		int max = tableIfInts[0];
		int j = tableIfInts.length - 1;
		System.out.println("the max number is " + max);
		for (int k = 0; k < tableIfInts.length; k++) {
			if (max < tableIfInts[j]) {
				max = tableIfInts[j];
			}
			j--;
		}
		System.out.println("Max number of the array is " + max);
	}
}
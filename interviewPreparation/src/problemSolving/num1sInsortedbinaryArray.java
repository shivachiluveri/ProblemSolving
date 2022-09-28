package problemSolving;
import java.util.Scanner;
public class num1sInsortedbinaryArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solve(arr));
	}
	public static int solve(int[] arr) {
		int currPointer = 0;
		while (currPointer < arr.length) {
			if (arr[currPointer] == 1) {
				// as we have found our first one, we will stop here and
				// result would be (arr.length-currPinter)
				break;
			}
			// we will keep on increasing currPoniter as long as we are
			// encountering zeroes
			currPointer++;
		}
		return (arr.length - currPointer);
	}
}
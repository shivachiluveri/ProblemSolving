package problemSolving;

public class FindPairsWithSumEqualsTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,1,4,7};
		findPairsWithSumEqualsToXBruteForce(a,4);

	}
	
	public static void findPairsWithSumEqualsToXBruteForce(int arr[], int X) {
	    if (arr.length < 2)
	        return;
	 
	    System.out.println("The pair whose sum is equal to 4 using brute force method: ");
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            int tempSum = arr[i] + arr[j];
	 
	            if (tempSum == X) {
	                System.out.println(arr[i] + " " + arr[j]);
	            }
	        }
	    }
	}

}

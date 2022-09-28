package basicPrograms;

public class DecToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 decToBinary(7);
	}
	public static void dtb(int n) {
		int binNums[] = new int[1000];
		int i = 0;
		while (n > 0) {
			binNums[i] = n % 2;
			n = n / 2;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(binNums[j]);
		}
	}
	
	
	  public static void decToBinary(int n)
	    {
	        // Size of an integer is assumed to be 32 bits
	        for (int i = 31; i >= 0; i--) {
	            int k = n >> i;
	            if ((k & 1) > 0)
	                System.out.print("1");
	            else
	                System.out.print("0");
	        }
	    }
	}

//hex to decimal
//dec to hex
//dec  to octal
//binary string to decimal

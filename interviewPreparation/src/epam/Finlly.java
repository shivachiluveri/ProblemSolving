package epam;

public class Finlly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ia,ia1,ia2,ia3,ia4; 
		ia='a'; ia1='b'; ia2='c';
		System.out.println("char/int is:::"+ia + ia1 +ia2);
		System.out.println(m1(111));
	}

		@SuppressWarnings("finally")
		public static int m1(int a) {
			if(a<100)
			try{
				return 777;
			}
			catch(Exception e) {
				return 888;
			}
			finally{
				return 999;
			}
			return 12;
		}

	
}


 


package basics;

public class  FIbonnaci{

	public static void main(String[] args){
		int factorial = fac(4);
	
		System.out.println(factorial);
		
	}
	static int fac(int n)
	{
	int output;
	if (n == 1)  {
		return 1;
	}

		
		output = fac(n-1)+ n;
		return output;
		
	}
	
	
}
